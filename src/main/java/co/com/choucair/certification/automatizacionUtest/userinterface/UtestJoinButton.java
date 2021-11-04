package co.com.choucair.certification.automatizacionUtest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestJoinButton extends PageObject {

    public static final Target BUTTON_JOIN = Target.the("the Button Joion").located(By.xpath("//a[@href='/signup/personal']"));
}
