package co.com.choucair.certification.automatizacionUtest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestLastStep {

        public static final Target INPUT_PASSWORD = Target.the("Write password")
                .located(By.id("password"));
        public static final Target INPUT_CONFIRMPASSWORD = Target.the("Write confirm password")
                .located(By.id("confirmPassword"));
        public static final Target CHECK_TERMS = Target.the("Selection check terms of the use")
                .located(By.xpath("//input[@id='termOfUse']/following-sibling::span[1]"));
        public static final Target CHECK_PRIVACY = Target.the("Selection check privacy security policy")
                .located(By.xpath("(//span[contains(@class,'checkmark signup-consent__checkbox')])[3]"));
       // public static final Target BUTTON_SETUP = Target.the("Click in the botton complete setp")
               // .located(By.xpath("//a[@class='btn btn-blue']"));

    }



