package tasks;

import interations.anuncio;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import userinterfaces.SearchStaysPage;


public class BusquedaAlojamiento implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                anuncio.quit(),
                Click.on(SearchStaysPage.Txt_where_are_you_going),
                Click.on(SearchStaysPage.BTN_Selector),
                Click.on(SearchStaysPage.BTN_Checkin_checkout),
                Click.on(SearchStaysPage.BTN_Checkin_checkout),
                Click.on(SearchStaysPage.Txt_entrada),
                Click.on(SearchStaysPage.Txt_salida),
                Click.on(SearchStaysPage.MENU),
                Click.on(SearchStaysPage.Agregar_adulto),
                Click.on(SearchStaysPage.btn_Buscar));




    }
    public static BusquedaAlojamiento busqueda(){
        return Tasks.instrumented(BusquedaAlojamiento.class);
    }
}
