package co.com.choucair.certification.automatizacionUtest.tasks;

import co.com.choucair.certification.automatizacionUtest.model.DataUtes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static co.com.choucair.certification.automatizacionUtest.userinterface.UtestDataBasic.*;


public class DataBasic implements Task {
    DataUtes dataUtes;

    public DataBasic (DataUtes dataUtes){
        this.dataUtes = dataUtes;

}
    public static Performable theUser(DataUtes dataUtes) {
        return Tasks.instrumented(DataBasic.class,dataUtes);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(dataUtes.getFirstname()).into(INPUT_FIRSTNAME),
                (Enter.theValue(dataUtes.getLastname()).into(INPUT_LASTNAME)),
                (Enter.theValue(dataUtes.getEmail()).into(INPUT_EMAIL)),
                SelectFromOptions.byVisibleText(dataUtes.getMonth()).from(INPUT_MONTH),
        SelectFromOptions.byVisibleText(dataUtes.getDay()).from(INPUT_DAY),
        SelectFromOptions.byVisibleText(dataUtes.getYear()).from(INPUT_YEAR),
        (Click.on(BOTTON_NEXT)));


    }
}
