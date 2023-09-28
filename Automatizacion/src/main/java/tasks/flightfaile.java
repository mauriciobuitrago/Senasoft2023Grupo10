package tasks;

import interations.anuncio;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actors.OnStage;

import static userinterfaces.flightpage.*;
import static userinterfaces.topbarcomponent.Btn_flight;

public class flightfaile implements Task {
    private String lugar_salidad;
    private String lugar_llegada;

    public flightfaile(String lugar_salidad, String lugar_llegada) {
        this.lugar_salidad = lugar_salidad;
        this.lugar_llegada = lugar_llegada;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                anuncio.quit(),
                Click.on(Btn_flight),
                Click.on(Rtn_single_trip),
                Click.on(Btn_passengers),
                Click.on(Btn_passengers_children),
                Click.on(Btn_passengers),

                Click.on(Btn_exitflight),
                Enter.keyValues(lugar_salidad).into(Txt_exitflight),
                Click.on(Btn_select_airport_exit),
                Click.on(Btn_arrivalflight),
                Enter.keyValues(lugar_llegada).into(Txt_arrivalflight),
                Click.on(Btn_select_airport_arrival),
                Click.on(Btn_fecha),
                Click.on(Btn_fechaespecifica),
                Click.on(Btn_buscar)

        );

    }

    public static flightfaile flig(String lugar_salidad, String lugar_llegada){
        return Tasks.instrumented(flightfaile.class, lugar_salidad, lugar_llegada);

    }


}
