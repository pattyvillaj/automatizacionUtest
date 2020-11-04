package co.com.choucair.certification.automatizacionUtest.tasks;

import co.com.choucair.certification.automatizacionUtest.userinterface.UtestFormDataBasicPage;
import co.com.choucair.certification.automatizacionUtest.userinterface.UtestFormLocationPage;
import co.com.choucair.certification.automatizacionUtest.userinterface.UtestLastStepPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class RegistrationLastStep implements Task {

    private String password;

    public RegistrationLastStep(String password){
        this.password = password;

    }

    public static RegistrationLastStep the(String password) {
        return Tasks.instrumented(RegistrationLastStep.class, password);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(this.password).into(UtestLastStepPage.INPUT_PASSWORD));
        actor.attemptsTo(Enter.theValue(this.password).into(UtestLastStepPage.INPUT_CONFIRMPASSWORD));
        actor.attemptsTo(Click.on(UtestLastStepPage.CHECK_TERMS));
        actor.attemptsTo(Click.on(UtestLastStepPage.CHECK_PRIVACY));
        actor.attemptsTo(Click.on(UtestLastStepPage.BUTTON_SETP));
    }
}
