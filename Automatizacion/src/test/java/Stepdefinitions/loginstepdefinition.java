package Stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import models.actor;
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

public class loginstepdefinition {
actor actor=new actor();

    @Given("The user enters the page")
    public void theUserEntersThePage() {
        actor.SetUp();



    }

    @When("the user enters to login with {string} email and password {string}")
    public void theUserEntersTologin(String email, String password) {
        OnStage.theActorInTheSpotlight().attemptsTo(login.usuarios(email, password));

    }


    @Then("the user verifies successful login")
    public void theUserVerifiesSuccessfullogin() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(validationlogin.comparar(), Matchers.is(true)));

    }

    @Then("the user verifies unsuccessful login")
    public void theUserVerifiesunsuccessfullogin() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(validationlogin.comparar(), Matchers.is(true)));

    }
}
