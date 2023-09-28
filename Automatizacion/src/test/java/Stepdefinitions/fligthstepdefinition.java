package Stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import models.actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;
import questions.validationflight;
import questions.validationflightfaile;
import tasks.flight;
import tasks.flightfaile;

public class fligthstepdefinition {

    models.actor actor = new actor();




    @When("the user enters departure from {string} arrival in {string} and specifies the date")
    public void theUserCompletesAllFieldsCorrectly(String salidad, String llegada) {
        OnStage.theActorInTheSpotlight().attemptsTo(flight.flig(salidad, llegada));

    }

    @Then("It validates that a successful search was made")
    public void itValidatesThatASuccessfulSearchWasMade() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(validationflight.compara(), Matchers.is(true)));

    }

    @When("the user enters departure from {string} arrival in {string}, one children sin edad and specifies the dat")
    public void theUsernotCompletesAllFieldsinCorrectly(String salidad, String llegada) {
        OnStage.theActorInTheSpotlight().attemptsTo(flightfaile.flig(salidad, llegada));

    }

    @Then("Validates that an erroneous search was performed")
    public void Validatesthatanerroneoussearchwasperformed() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(validationflightfaile.compara(), Matchers.is(true)));

    }


}
