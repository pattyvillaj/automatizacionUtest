package co.com.choucair.certification.automatizacionUtest.tasks;

import co.com.choucair.certification.automatizacionUtest.model.DataUtes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.choucair.certification.automatizacionUtest.userinterface.UtestLastStep.*;

public class LastStep implements Task {
         DataUtes dataUtes;

         public LastStep (DataUtes dataUtes){
            this.dataUtes = dataUtes;

                 }
                 public static Performable theUser(DataUtes dataUtes) {
                     return Tasks.instrumented(LastStep.class,dataUtes);
                 }

        @Override
        public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(Enter.theValue(dataUtes.getPassword()).into(INPUT_PASSWORD));
            actor.attemptsTo(Enter.theValue(dataUtes.getConfirmPassword()).into(INPUT_CONFIRMPASSWORD));
            actor.attemptsTo(Click.on(CHECK_TERMS));
            actor.attemptsTo(Click.on(CHECK_PRIVACY));
           // actor.attemptsTo(Click.on(BUTTON_SETUP));
        }
    }


