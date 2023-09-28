package models;

import io.cucumber.java.Before;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class actor {
    @Managed
    WebDriver driver;

    public  void  SetUp(){
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("edwin");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(driver));
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.booking.com/"));
    }



}
