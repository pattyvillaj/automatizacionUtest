package co.com.choucair.certification.automatizacionUtest.tasks;

import co.com.choucair.certification.automatizacionUtest.userinterface.UtestJoinButton;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class JoinButton implements Task {
    private UtestJoinButton utestJoinButton;

    public static JoinButton onThePage() {
        return Tasks.instrumented(JoinButton.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(utestJoinButton.BUTTON_JOIN));

    }
}
