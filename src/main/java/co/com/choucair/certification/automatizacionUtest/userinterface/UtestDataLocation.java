package co.com.choucair.certification.automatizacionUtest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestDataLocation {

    public static final Target INPUT_CITY = Target.the("The city").located(By.id("city"));
    public static final Target INPUT_ZIP = Target.the("The Zip").located(By.id("zip"));
    public static final Target SPAN_COUNTRY = Target.the("The country").located(By.xpath("//span[@class='ui-select-match-text pull-left']"));
    public static final Target INPUT_COUNTRY = Target.the("The country").located(By.xpath("(//input[contains(@class,'form-control ui-select-search')])[2]"));
    public static final Target BUTTON_NEXTDIVICES = Target.the("Click in the botton Next:Location").located(By.xpath("//a[@class='btn btn-blue pull-right']"));
}
