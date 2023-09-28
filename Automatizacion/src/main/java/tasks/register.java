package tasks;

import interations.anuncio;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actors.OnStage;

import static userinterfaces.register_or_loginpage.*;
import static userinterfaces.topbarcomponent.Btn_register;

public class register implements Task {
    private String email;
    private String password;

    public register(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        OnStage.theActorInTheSpotlight().attemptsTo(
        anuncio.quit(),


                Click.on(Btn_register),
                Enter.keyValues(email).into(Txt_email),
                Click.on(Btn_following),
                Enter.keyValues(password).into(Txt_new_password),
                Enter.keyValues(password).into(Txt_confir_password),
                Click.on(Btn_create_Account)




        );


    }
    public static register usuarios(String email, String password) {
        return Tasks.instrumented(register.class, email, password);
    }
}
