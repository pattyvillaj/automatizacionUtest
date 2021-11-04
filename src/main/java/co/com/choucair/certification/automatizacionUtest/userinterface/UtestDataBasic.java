package co.com.choucair.certification.automatizacionUtest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestDataBasic {


    public static final Target INPUT_FIRSTNAME = Target.the("First name").located(By.id("firstName"));
    public static final Target INPUT_LASTNAME = Target.the("Last name").located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the("Email").located(By.id("email"));
    public static final Target INPUT_MONTH = Target.the("Month").located(By.id("birthMonth"));
    public static final Target INPUT_DAY = Target.the("Day").located(By.id("birthDay"));
    public static final Target INPUT_YEAR = Target.the("Year").located(By.id("birthYear"));
    public static final Target BOTTON_NEXT = Target.the("Botton next").located(By.xpath("//span[text()='Next: Location']"));
}


    
