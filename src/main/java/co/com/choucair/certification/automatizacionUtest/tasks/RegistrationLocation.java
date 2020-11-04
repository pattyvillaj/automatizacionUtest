package co.com.choucair.certification.automatizacionUtest.tasks;

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


public class RegistrationLocation implements Task {
    private String city, zip, country;

    public RegistrationLocation(String city, String zip, String country){
        this.city = city;
        this.zip = zip;
        this.country = country;

    }

    public static RegistrationLocation the(String city, String zip, String country) {
        return Tasks.instrumented(RegistrationLocation.class,city, zip, country);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Enter.theValue(this.city).into(UtestFormLocationPage.INPUT_CITY),
                Hit.the(Keys.ARROW_DOWN).into(UtestFormLocationPage.INPUT_CITY),
                Hit.the(Keys.ENTER).into(UtestFormLocationPage.INPUT_CITY)
        );
        actor.attemptsTo(Click.on(UtestFormLocationPage.INPUT_ZIP),
                Enter.theValue(this.zip).into(UtestFormLocationPage.INPUT_ZIP));

        actor.attemptsTo(Click.on(UtestFormLocationPage.SPAN_COUNTRY));

        actor.attemptsTo(Wait.until(WebElementQuestion.the(UtestFormLocationPage.INPUT_COUNTRY),
                WebElementStateMatchers.isEnabled()).forNoLongerThan(5).seconds());

        actor.attemptsTo(Enter.theValue(this.country).into(UtestFormLocationPage.INPUT_COUNTRY),
                Hit.the(Keys.ARROW_DOWN).into(UtestFormLocationPage.INPUT_COUNTRY),
                Hit.the(Keys.ENTER).into(UtestFormLocationPage.INPUT_COUNTRY),
                Click.on(UtestFormLocationPage.BUTTON_NEXTDIVICES));

    }

}

