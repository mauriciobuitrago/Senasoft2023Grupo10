package Stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import tasks.car_rental;

public class car_retalstepdefinition {



    @When("the user completes all car rental fields correctly")
    public void theUserCompletesAllCarRentalFieldsCorrectly() {
        OnStage.theActorInTheSpotlight().attemptsTo(car_rental.rental());

    }
    @Then("It is validated that you made a successful car rental search")
    public void itIsValidatedThatYouMadeASuccessfulCarRentalSearch() {

    }
}
