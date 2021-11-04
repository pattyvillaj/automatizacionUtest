package co.com.choucair.certification.automatizacionUtest.tasks;

import co.com.choucair.certification.automatizacionUtest.model.DataUtes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.serenitybdd.screenplay.waits.Wait;
import org.openqa.selenium.Keys;

import static co.com.choucair.certification.automatizacionUtest.userinterface.UtestDataLocation.*;

public class DataLocation implements Task {
    DataUtes dataUtes;

    public DataLocation (DataUtes dataUtes)  {

        this.dataUtes = dataUtes;
    }


    public static DataLocation theUser(DataUtes dataUtes) {
        return Tasks.instrumented(DataLocation.class, dataUtes);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(dataUtes.getCity()).into(INPUT_CITY),
                Hit.the(Keys.ARROW_DOWN).into(INPUT_CITY),
                Hit.the(Keys.ENTER).into(INPUT_CITY)
        );
        actor.attemptsTo(Click.on(INPUT_ZIP),
                Enter.theValue(dataUtes.getZip()).into(INPUT_ZIP));

        actor.attemptsTo(Click.on(SPAN_COUNTRY));

        actor.attemptsTo(Wait.until(WebElementQuestion.the(INPUT_COUNTRY),
                WebElementStateMatchers.isEnabled()).forNoLongerThan(5).seconds());

        actor.attemptsTo(Enter.theValue(dataUtes.getCountry()).into(INPUT_COUNTRY),
                Hit.the(Keys.ARROW_DOWN).into(INPUT_COUNTRY),
                Hit.the(Keys.ENTER).into(INPUT_COUNTRY),
                Click.on(BUTTON_NEXTDIVICES));
    }
}
