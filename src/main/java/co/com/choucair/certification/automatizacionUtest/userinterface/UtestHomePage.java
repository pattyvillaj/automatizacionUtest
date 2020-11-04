package co.com.choucair.certification.automatizacionUtest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestHomePage extends PageObject {

    public static final Target JOIN_BUTTON = Target.the("button Join Today")
            .located(By.xpath("//a[@class='unauthenticated-nav-bar__sign-up']"));
}

