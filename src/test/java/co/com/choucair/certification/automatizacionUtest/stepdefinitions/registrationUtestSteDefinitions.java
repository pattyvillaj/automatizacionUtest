package co.com.choucair.certification.automatizacionUtest.stepdefinitions;


import co.com.choucair.certification.automatizacionUtest.tasks.JoinsRegistration;
import co.com.choucair.certification.automatizacionUtest.tasks.OpenUp;
import co.com.choucair.certification.automatizacionUtest.tasks.RegistrationDataBasic;
import co.com.choucair.certification.automatizacionUtest.tasks.RegistrationLocation;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
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

    }

    @Then("^she will see the welcome message$")
    public void sheWillSeeTheWelcomeMessage() {

    }

}
