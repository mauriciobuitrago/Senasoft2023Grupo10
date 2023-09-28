package runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/Features/flight.feature",
        glue ="Stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE,

        tags="@1"


)
public class flightrunner {
}
