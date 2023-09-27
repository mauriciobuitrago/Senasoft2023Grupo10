package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class topbarcomponent {

    public static final Target Btn_login = Target.the("dar click en el boton de logiarse").locatedBy("//*[@id=\"b2indexPage\"]/div[2]/div/header/nav[1]/div[2]/div/a");
    public static  final Target validar = Target.the("vaidar usuario").locatedBy("//*[@id=\"b2searchresultsPage\"]/div[4]/div/header/nav[1]/div[2]/div/span/button/span/div");
}
