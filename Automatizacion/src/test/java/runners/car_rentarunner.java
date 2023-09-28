package runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/Features/car_rental.feature",
        glue = "Stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE,

        tags = ""
)


public class car_rentarunner {
}
