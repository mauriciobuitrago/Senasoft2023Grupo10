package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.questions.Visibility;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static userinterfaces.flightpage.validar_vuelo;
import static userinterfaces.flightpage.validar_vuelo_faile;

public class validationflightfaile implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {

        return Visibility.of(validar_vuelo_faile).viewedBy(actor).asBoolean();
    }

    public static validationflightfaile compara(){
        return new validationflightfaile();
    }
}
