package co.com.choucair.certification.automatizacionUtest.tasks;

import co.com.choucair.certification.automatizacionUtest.userinterface.UtestRegistrationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class JoinsRegistration implements Task {
    private UtestRegistrationPage utestRegistrationPage;


    public static JoinsRegistration OnthePage() {
        return Tasks.instrumented(JoinsRegistration.class);
    }

        @Override
        public <T extends Actor > void performAs(T actor) {
            actor.attemptsTo(Click.on(UtestRegistrationPage.JOIN_BUTTON));

        }
}