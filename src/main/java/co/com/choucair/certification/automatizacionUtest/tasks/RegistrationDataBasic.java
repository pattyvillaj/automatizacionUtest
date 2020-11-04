package co.com.choucair.certification.automatizacionUtest.tasks;

import co.com.choucair.certification.automatizacionUtest.userinterface.UtestFormDataBasicPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;


public class RegistrationDataBasic implements Task {
    private String firstName, lastName,  emailAddress,  month,  day,  year;

    public RegistrationDataBasic(String firstName, String lastName, String emailAddress, String month, String day, String year){
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.month = month;
        this.day = day;
        this.year = year;

    }


    public static RegistrationDataBasic the(String firstName, String lastName, String emailAddress, String month, String day, String year) {
        return Tasks.instrumented(RegistrationDataBasic.class,firstName, lastName,  emailAddress,  month,  day,  year);
    }



    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(this.firstName).into(UtestFormDataBasicPage.INPUT_NAME),
                Enter.theValue(this.lastName).into(UtestFormDataBasicPage.INPUT_LASTNAME),
                Enter.theValue(this.emailAddress).into(UtestFormDataBasicPage.INPUT_EMAIL),
                SelectFromOptions.byVisibleText(this.month).from(UtestFormDataBasicPage.INPUT_MONT),
                SelectFromOptions.byVisibleText(this.day).from(UtestFormDataBasicPage.INPUT_DAY),
                SelectFromOptions.byVisibleText(this.year).from(UtestFormDataBasicPage.INPUT_YEAR),
                Click.on(UtestFormDataBasicPage.BUTTON_NEXT)

        );

    }
}