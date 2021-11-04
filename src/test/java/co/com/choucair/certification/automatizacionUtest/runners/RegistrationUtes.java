package co.com.choucair.certification.automatizacionUtest.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (features = "src/test/resources/features/registrationUtest.feature",
        tags = "@stories",
        glue = "co.com.choucair.certification.automatizacionUtest.stepdefinitions",
        snippets = SnippetType.CAMELCASE)

public class RegistrationUtes {
}
