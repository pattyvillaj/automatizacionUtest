package co.com.choucair.certification.automatizacionUtest.stepdefinitions;

import co.com.choucair.certification.automatizacionUtest.model.DataUtes;
import co.com.choucair.certification.automatizacionUtest.questions.Answer;
import co.com.choucair.certification.automatizacionUtest.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class RegistrationUtestDefinitions {

    @Before
    public void setStage (){
        setTheStage(new OnlineCast());
    }


    @Given("^than Sonia want register on the utest plataform$")
    public void thanSoniaWantRegisterOnTheUtestPlataform() {
        theActorCalled("Maria").wasAbleTo(OpenUpPage.thePage(), JoinButton.onThePage());


    }

    @When("^she enters her data in the registration form$")
    public void sheEntersHerDataInTheRegistrationForm(List<DataUtes> dataUtesList) {
        theActorInTheSpotlight().attemptsTo(DataBasic.theUser(dataUtesList.get(0)));
        theActorInTheSpotlight().attemptsTo(DataLocation.theUser(dataUtesList.get(0)));
        theActorInTheSpotlight().attemptsTo(DataDevices.theUser(dataUtesList.get(0)));
        theActorInTheSpotlight().attemptsTo(LastStep.theUser(dataUtesList.get(0)));
    }

    @Then("^the registration is completed by clicking on the button (.*)$")
    public void theRegistrationIsCompletedByClickingOnTheButtonCompleteSetup(String question) {
        theActorInTheSpotlight().should(seeThat(Answer.toThe(question)));
    }

}


