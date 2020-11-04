package co.com.choucair.certification.automatizacionUtest.tasks;

import co.com.choucair.certification.automatizacionUtest.userinterface.UtestFormDevicesPage;
import co.com.choucair.certification.automatizacionUtest.userinterface.UtestFormLocationPage;
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

public class RegistrationDevices implements Task {
    private String yourComputer, version, language, device, model, operatingSystem;

    public RegistrationDevices(String yourComputer, String version, String language, String device, String model, String operatingSystem) {
        this.yourComputer = yourComputer;
        this.version = version;
        this.language = language;
        this.device = device;
        this.model = model;
        this.operatingSystem = operatingSystem;
    }
    public static RegistrationDevices the(String yourComputer, String version, String language, String device, String model, String operatingSystem) {
        return Tasks.instrumented(RegistrationDevices.class,yourComputer, version, language, device, model, operatingSystem);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(Click.on(UtestFormDevicesPage.SPAN_COMPUTER));

        actor.attemptsTo(Wait.until(WebElementQuestion.the(UtestFormDevicesPage.INPUT_COMPUTER),
                WebElementStateMatchers.isEnabled()).forNoLongerThan(5).seconds());

        actor.attemptsTo(Enter.theValue(this.yourComputer).into(UtestFormDevicesPage.INPUT_COMPUTER),
                Hit.the(Keys.ARROW_DOWN).into(UtestFormDevicesPage.INPUT_COMPUTER),
                Hit.the(Keys.ENTER).into(UtestFormDevicesPage.INPUT_COMPUTER));

        actor.attemptsTo(Click.on(UtestFormDevicesPage.SPAN_VERSION));

        actor.attemptsTo(Wait.until(WebElementQuestion.the(UtestFormDevicesPage.INPUT_VERSION),
                WebElementStateMatchers.isEnabled()).forNoLongerThan(5).seconds());

        actor.attemptsTo(Enter.theValue(this.version).into(UtestFormDevicesPage.INPUT_VERSION),
                Hit.the(Keys.ARROW_DOWN).into(UtestFormDevicesPage.INPUT_VERSION),
                Hit.the(Keys.ENTER).into(UtestFormDevicesPage.INPUT_VERSION));

        actor.attemptsTo(Click.on(UtestFormDevicesPage.SPAN_LANGUAGE));

        actor.attemptsTo(Wait.until(WebElementQuestion.the(UtestFormDevicesPage.INPUT_LANGUAJE),
                WebElementStateMatchers.isEnabled()).forNoLongerThan(5).seconds());

        actor.attemptsTo(Enter.theValue(this.language).into(UtestFormDevicesPage.INPUT_LANGUAJE),
                Hit.the(Keys.ARROW_DOWN).into(UtestFormDevicesPage.INPUT_LANGUAJE),
                Hit.the(Keys.ENTER).into(UtestFormDevicesPage.INPUT_LANGUAJE));


        actor.attemptsTo(Click.on(UtestFormDevicesPage.SPAN_DEVICE));

        actor.attemptsTo(Wait.until(WebElementQuestion.the(UtestFormDevicesPage.INPUT_DEVICE),
                WebElementStateMatchers.isEnabled()).forNoLongerThan(5).seconds());

        actor.attemptsTo(Enter.theValue(this.device).into(UtestFormDevicesPage.INPUT_DEVICE),
                Hit.the(Keys.ENTER).into(UtestFormDevicesPage.INPUT_DEVICE));

        actor.attemptsTo(Click.on(UtestFormDevicesPage.SPAN_MODEL));

        actor.attemptsTo(Wait.until(WebElementQuestion.the(UtestFormDevicesPage.INPUT_MODEL),
                WebElementStateMatchers.isEnabled()).forNoLongerThan(5).seconds());

        actor.attemptsTo(Enter.theValue(this.model).into(UtestFormDevicesPage.INPUT_MODEL),
                Hit.the(Keys.ENTER).into(UtestFormDevicesPage.INPUT_MODEL));

        actor.attemptsTo(Click.on(UtestFormDevicesPage.SPAN_SYSTEM));

        actor.attemptsTo(Wait.until(WebElementQuestion.the(UtestFormDevicesPage.INPUT_SYSTEM),
                WebElementStateMatchers.isEnabled()).forNoLongerThan(5).seconds());

        actor.attemptsTo(Enter.theValue(this.operatingSystem).into(UtestFormDevicesPage.INPUT_SYSTEM),
                Hit.the(Keys.ENTER).into(UtestFormDevicesPage.INPUT_SYSTEM),
                Click.on(UtestFormDevicesPage.BUTTON_LASTSTEP));



    }

}

