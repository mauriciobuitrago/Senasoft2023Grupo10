package interations;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.questions.Visibility;

import static userinterfaces.homepage.Btn_anuncio;

public class anuncio implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {


        if (Visibility.of(Btn_anuncio).viewedBy(actor).asBoolean()) {
            OnStage.theActorInTheSpotlight().attemptsTo(
                    Click.on(Btn_anuncio)

            );
        }
    }

    public static anuncio quit() {
        return Tasks.instrumented(anuncio.class);
    }

}
