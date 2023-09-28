package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterfaces.SearchStaysPage;

public class validationsearchStays implements Question{


    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(SearchStaysPage.validacion).viewedBy(actor).asString();
    }

    public static  validationsearchStays comparacion(){
        return new validationsearchStays();
    }
}


