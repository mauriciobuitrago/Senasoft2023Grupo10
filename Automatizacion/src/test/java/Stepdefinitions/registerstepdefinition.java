package Stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.it.Ma;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class registerstepdefinition {
    @Managed
     WebDriver driver;

    @Before
    public  void  SetUp(){
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("edwin");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(driver));
    }


    @Given("The user enters the page (.*)")
    public void theUserEntersThePageHttpsWwwBookingCom(String url) {

    }

    @When("the user enters to register with (.*) email")
    public void theUserEntersToRegisterWithAutomationEmail(String email) {

    }

    @When("password (.*)")
    public void passwordAutomatizacion(String password) {

    }

    @Then("the user verifies successful registration")
    public void theUserVerifiesSuccessfulRegistration() {

    }
}
