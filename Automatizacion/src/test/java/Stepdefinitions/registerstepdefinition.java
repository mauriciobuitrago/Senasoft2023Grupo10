package Stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import models.actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;
import questions.validationlogin;
import tasks.register;

public class registerstepdefinition {
    models.actor actor = new actor();

    @Given("The user enters the page")
    public void theUserEntersThePage() {
        actor.SetUp();


    }


    @When("the user enters email {string} and enters password {string} in the dos fields")
    public void theUserEntersEmailAndEntersPasswordInTheFields(String email, String password) {
        OnStage.theActorInTheSpotlight().attemptsTo(register.usuarios(email, password));

    }

    @Then("It will validate that a successful registration was made")
    public void itWillValidateThatASuccessfulRegistrationWasMade() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(validationlogin.comparar(), Matchers.is(true)));

    }

}
