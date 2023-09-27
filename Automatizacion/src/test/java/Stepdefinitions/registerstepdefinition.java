package Stepdefinitions;

import interations.anuncio;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;
import questions.validationlogin;
import tasks.login;

import java.util.regex.Matcher;

public class registerstepdefinition {
    @Managed
     WebDriver driver;

    @Before
    public  void  SetUp(){
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("edwin");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(driver));
    }


    @Given("The user enters the page")
    public void theUserEntersThePage() {
      OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.booking.com/"));

    }

    @When("the user enters to login with {string} email and password {string}")
    public void theUserEntersTologin(String email, String password) {

        OnStage.theActorInTheSpotlight().attemptsTo(login.usuarios(email,password));

    }


    @Then("the user verifies successful login")
    public void theUserVerifiesSuccessfullogin() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(validationlogin.comparar(), Matchers.is(true)));

    }
}
