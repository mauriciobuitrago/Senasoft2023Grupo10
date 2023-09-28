package tasks;

import interations.anuncio;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static userinterfaces.registerorloginpage.*;
import static userinterfaces.topbarcomponent.Btn_login;

public class login implements Task {

    private String email;
    private String password;

    public login(String email, String password) {
        this.email = email;
        this.password = password;
    }



    @Override
    public <T extends Actor> void performAs(T actor) {

        OnStage.theActorInTheSpotlight().attemptsTo(
                anuncio.quit(),


                Click.on(Btn_login),
                Enter.keyValues(email).into(Txt_email),
                Click.on(Btn_following),
                Enter.keyValues(password).into(Txt_password),
                Click.on(Txt_password),

                Click.on(Btn_login1)





        );


    }


    public static login usuarios(String email, String password) {
        return Tasks.instrumented(login.class, email, password);
    }


}
