package co.com.choucair.certification.automatizacionUtest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestFinshFormPage  {

    public static final Target TEXT_CONFIRMED = Target.the("Confirmed text")
            .located(By.xpath("//b[text()='First, please check your email inbox']"));


}
