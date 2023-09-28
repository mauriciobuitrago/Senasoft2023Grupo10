package Stepdefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import models.actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

import questions.validationsearchStays;
import tasks.BusquedaAlojamiento;


public class StaysStepdefinitions {


  models.actor actor = new actor();


    @Given("he user is on the web page")
    public void heUserIsOnTheWebPage() {
      actor.SetUp();


    }
    @When("the user fills out all the fields without bringing children")
    public void theUserFillsOutAllTheFieldsWithoutBringingChildren() {
        OnStage.theActorInTheSpotlight().attemptsTo(BusquedaAlojamiento.busqueda());


    }

    @Then("a successful search is performed")
    public void  asuccessfulsearchisperformed(){
      OnStage.theActorInTheSpotlight().should(

              GivenWhenThen.seeThat(validationsearchStays.comparacion(), Matchers.is("Filtrar por:")));



    }



}
