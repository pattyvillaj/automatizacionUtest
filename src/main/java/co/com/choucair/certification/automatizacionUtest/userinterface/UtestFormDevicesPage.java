package co.com.choucair.certification.automatizacionUtest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestFormDevicesPage {

        public static final Target SPAN_COMPUTER = Target.the("click computer")
                .located(By.xpath("//span[contains(@class,'ui-select-match-text pull-left')]"));
        public static final Target INPUT_COMPUTER =Target.the("write computer")
                .located(By.xpath("//input[@ng-model='$select.search']"));

        public static final Target SPAN_VERSION = Target.the("click version")
                .located(By.xpath("(//span[contains(@class,'btn btn-default')])[2]"));
        public static final Target INPUT_VERSION =Target.the("write version")
                .located(By.xpath("(//input[@ng-model='$select.search'])[2]"));

        public static final Target SPAN_LANGUAGE = Target.the("click languaje")
                .located(By.xpath("//span[text()='Select OS language']"));
        public static final Target INPUT_LANGUAJE =Target.the("write languaje")
                .located(By.xpath("//input[@placeholder='Select OS language']"));

        public static final Target SPAN_DEVICE = Target.the("click device")
                .located(By.xpath("//span[text()='Select Brand']"));
        public static final Target INPUT_DEVICE =Target.the("write device")
                .located(By.xpath("//input[@placeholder='Select Brand']"));

        public static final Target SPAN_MODEL = Target.the("click model")
                .located(By.xpath("//span[text()='Select a Model']"));
        public static final Target INPUT_MODEL =Target.the("write model")
                .located(By.xpath("//input[@placeholder='Select a Model']"));

        public static final Target SPAN_SYSTEM = Target.the("click model")
                .located(By.xpath("(//span[text()='Select OS'])[2]"));
        public static final Target INPUT_SYSTEM =Target.the("write model")
                .located(By.xpath("//label[text()='Operating System:']/following::input"));

        public static final Target BUTTON_LASTSTEP = Target.the("Click in the botton Next:Location")
                .located(By.xpath("//a[@class='btn btn-blue pull-right']"));
}
