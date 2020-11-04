package co.com.choucair.certification.automatizacionUtest.stepdefinitions;


import co.com.choucair.certification.automatizacionUtest.model.UtestData;
import co.com.choucair.certification.automatizacionUtest.questions.Answer;
import co.com.choucair.certification.automatizacionUtest.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;


public class registrationUtestSteDefinitions {

    @Before
    public void setStage () { OnStage.setTheStage((new OnlineCast())); }

    @Given("^than (.*) wants to register on the Utest platform$")
    public void thanAnaWantsToRegisterOnTheUtestPlatform(String actor) throws Exception{
        OnStage.theActorCalled(actor).wasAbleTo(OpenUp.thePage(), JoinsRegistration.OnthePage());

    }

    @When("^she enters her data in the registration form$")
    public void sheEntersHerDataInTheRegistrationForm(List<UtestData> utestData) {
        OnStage.theActorInTheSpotlight().attemptsTo(RegistrationDataBasic.the(utestData.get(0).getFirstName(), utestData.get(0).getLastName(), utestData.get(0).getEmailAddress(), utestData.get(0).getMonth(), utestData.get(0).getDay(), utestData.get(0).getYear() ));
        OnStage.theActorInTheSpotlight().attemptsTo(RegistrationLocation.the(utestData.get(0).getCity(), utestData.get(0).getZip(), utestData.get(0).getCountry()));
        OnStage.theActorInTheSpotlight().attemptsTo(RegistrationDevices.the(utestData.get(0).getYourComputer(),utestData.get(0).getVersion(), utestData.get(0).getLanguage(), utestData.get(0).getDevice(), utestData.get(0).getModel(), utestData.get(0).getOperatingSystem()));
        OnStage.theActorInTheSpotlight().attemptsTo(RegistrationLastStep.the(utestData.get(0).getPassword()));

    }

    @Then("^she will see the welcome message$")
    public void sheWillSeeTheWelcomeMessage() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe("First, please check your email inbox")));

    }

}
