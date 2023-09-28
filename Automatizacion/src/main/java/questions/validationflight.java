package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.matchers.statematchers.IsVisibleMatcher;
import net.serenitybdd.screenplay.questions.Visibility;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static userinterfaces.flightpage.validar_vuelo;

public class validationflight implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        OnStage.theActorInTheSpotlight().attemptsTo(WaitUntil.the(validar_vuelo, isVisible()).forNoMoreThan(10).seconds()
        );
        return Visibility.of(validar_vuelo).viewedBy(actor).asBoolean();
    }

    public static validationflight compara(){
        return new validationflight();
    }
}
