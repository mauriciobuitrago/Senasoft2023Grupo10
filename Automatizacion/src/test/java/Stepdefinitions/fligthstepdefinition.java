package Stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import models.actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;
import questions.validationflight;
import questions.validationlogin;
import tasks.flight;

public class fligthstepdefinition {
actor actor=new actor();

    @Given("the user enteres the page")
    public void theUserEnteresThePage() {
        actor.SetUp();
    }


    @When("the user enters departure from {string} arrival in {string} and specifies the date")
    public void theUserCompletesAllFieldsCorrectly(String salidad,String llegada ) {
        OnStage.theActorInTheSpotlight().attemptsTo(flight.flig(salidad, llegada));

    }
    @Then("It validates that a successful search was made")
    public void itValidatesThatASuccessfulSearchWasMade() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(validationflight.compara(), Matchers.is(true)));

    }



}
