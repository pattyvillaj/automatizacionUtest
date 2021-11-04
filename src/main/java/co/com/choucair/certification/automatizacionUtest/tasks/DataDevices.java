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

import static co.com.choucair.certification.automatizacionUtest.userinterface.UtestDataDevices.*;


public class DataDevices implements Task{
        DataUtes dataUtes;


        public DataDevices (DataUtes dataUtes)  {
            this.dataUtes = dataUtes;
        }


        public static DataDevices theUser(DataUtes dataUtes) {
            return Tasks.instrumented(DataDevices.class, dataUtes);

        }


        @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(Click.on(SPAN_COMPUTER));

        actor.attemptsTo(Wait.until(WebElementQuestion.the(INPUT_COMPUTER),
                WebElementStateMatchers.isEnabled()).forNoLongerThan(5).seconds());

        actor.attemptsTo(Enter.theValue(dataUtes.getYourComputer()).into(INPUT_COMPUTER),
                Hit.the(Keys.ARROW_DOWN).into(INPUT_COMPUTER),
                Hit.the(Keys.ENTER).into(INPUT_COMPUTER));

        actor.attemptsTo(Click.on(SPAN_VERSION));

        actor.attemptsTo(Wait.until(WebElementQuestion.the(INPUT_VERSION),
                WebElementStateMatchers.isEnabled()).forNoLongerThan(5).seconds());

        actor.attemptsTo(Enter.theValue(dataUtes.getVersion()).into(INPUT_VERSION),
                Hit.the(Keys.ARROW_DOWN).into(INPUT_VERSION),
                Hit.the(Keys.ENTER).into(INPUT_VERSION));

        actor.attemptsTo(Click.on(SPAN_LANGUAGE));

        actor.attemptsTo(Wait.until(WebElementQuestion.the(INPUT_LANGUAJE),
                WebElementStateMatchers.isEnabled()).forNoLongerThan(5).seconds());

        actor.attemptsTo(Enter.theValue(dataUtes.getLanguage()).into(INPUT_LANGUAJE),
                Hit.the(Keys.ARROW_DOWN).into(INPUT_LANGUAJE),
                Hit.the(Keys.ENTER).into(INPUT_LANGUAJE));


        actor.attemptsTo(Click.on(SPAN_DEVICE));

        actor.attemptsTo(Wait.until(WebElementQuestion.the(INPUT_DEVICE),
                WebElementStateMatchers.isEnabled()).forNoLongerThan(5).seconds());

        actor.attemptsTo(Enter.theValue(dataUtes.getDevice()).into(INPUT_DEVICE),
                Hit.the(Keys.ENTER).into(INPUT_DEVICE));

        actor.attemptsTo(Click.on(SPAN_MODEL));

        actor.attemptsTo(Wait.until(WebElementQuestion.the(INPUT_MODEL),
                WebElementStateMatchers.isEnabled()).forNoLongerThan(5).seconds());

        actor.attemptsTo(Enter.theValue(dataUtes.getModel()).into(INPUT_MODEL),
                Hit.the(Keys.ENTER).into(INPUT_MODEL));

        actor.attemptsTo(Click.on(SPAN_SYSTEM));

        actor.attemptsTo(Wait.until(WebElementQuestion.the(INPUT_SYSTEM),
                WebElementStateMatchers.isEnabled()).forNoLongerThan(5).seconds());

        actor.attemptsTo(Enter.theValue(dataUtes.getOperatingSystem()).into(INPUT_SYSTEM),
                Hit.the(Keys.ENTER).into(INPUT_SYSTEM),
                Click.on(BUTTON_LASTSTEP));



    }

}

