package co.com.choucair.certification.automatizacionUtest.stepdefinitions;


import co.com.choucair.certification.automatizacionUtest.questions.Answer;
import co.com.choucair.certification.automatizacionUtest.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


public class registrationUtestSteDefinitions {

    @Before
    public void setStage () { OnStage.setTheStage((new OnlineCast())); }

    @Given("^than Ana wants to register on the Utest platform$")
    public void thanAnaWantsToRegisterOnTheUtestPlatform() throws Exception{
        OnStage.theActorCalled("Ana").wasAbleTo(OpenUp.thePage(), JoinsRegistration.OnthePage());

    }

    @When("^she enters her data in the registration form$")
    public void sheEntersHerDataInTheRegistrationForm() {
        OnStage.theActorInTheSpotlight().attemptsTo(RegistrationDataBasic.the("María", "Alvarez", "maria123@gmail.com", "April", "20", "1995"));
        OnStage.theActorInTheSpotlight().attemptsTo(RegistrationLocation.the("Medellín", "050042", "Colombia"));
        OnStage.theActorInTheSpotlight().attemptsTo(RegistrationDevices.the("MacOs", "Os X 10.6","Spanish", "Apple", "iPhone 6", "iOS 10.0"));
        OnStage.theActorInTheSpotlight().attemptsTo(RegistrationLastStep.the("Asdfghj_1234567"));

    }

    @Then("^she will see the welcome message$")
    public void sheWillSeeTheWelcomeMessage() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe("First, please check your email inbox")));

    }

}
