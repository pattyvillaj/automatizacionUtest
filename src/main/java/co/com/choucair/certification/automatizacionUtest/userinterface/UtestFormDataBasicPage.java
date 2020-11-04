package co.com.choucair.certification.automatizacionUtest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestFormDataBasicPage {
    public static final Target INPUT_NAME = Target.the("Write first name")
            .located(By.id("firstName"));
    public static final Target INPUT_LASTNAME = Target.the("Write lastname")
            .located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the("Write an email")
            .located(By.id("email"));
    public static final Target INPUT_MONT = Target.the("Drop down of the moths")
            .located(By.id("birthMonth"));
    public static final Target INPUT_DAY = Target.the("Write the day")
            .located(By.id("birthDay"));
    public static final Target INPUT_YEAR = Target.the("Write the day")
            .located(By.id("birthYear"));
    public static final Target BUTTON_NEXT = Target.the("Click in the botton Next:Location")
            .located(By.xpath("//a[@class='btn btn-blue']"));


}
