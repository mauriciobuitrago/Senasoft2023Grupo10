package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;

import static userinterfaces.topbarcomponent.validarlogin;

public class validationlogin implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return Visibility.of(validarlogin).viewedBy(actor).asBoolean();
    }


    public static validationlogin comparar(){
        return new validationlogin();
    }
}
