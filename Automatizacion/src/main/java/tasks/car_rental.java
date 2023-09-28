package tasks;

import interations.anuncio;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actors.OnStage;
import org.checkerframework.checker.units.qual.C;

import static userinterfaces.rentalpage.*;
import static userinterfaces.topbarcomponent.Btn_rental_car;

public class car_rental implements Task {
    private String lugar="medelling";
    @Override
    public <T extends Actor> void performAs(T actor) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                anuncio.quit(),
                Click.on(Btn_rental_car),
                Click.on(Txt_buscar_recogida),
                Enter.keyValues(lugar).into(Txt_buscar_recogida2),
                Click.on(selecionar),
                Click.on(Txt_buscar_)

        );
    }

    public static car_rental rental(){
        return Tasks.instrumented(car_rental.class);
    }
}
