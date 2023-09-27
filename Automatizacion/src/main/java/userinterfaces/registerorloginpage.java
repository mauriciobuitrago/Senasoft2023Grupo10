package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class registerorloginpage {


    public static final Target Txt_email = Target.the("ingresa email").locatedBy("//*[@id=\"username\"]");
    public static final Target Btn_following = Target.the("oprime siguiente").locatedBy("//*[@id=\"root\"]/div/div/div/div[2]/div[1]/div/div/div/div/div/div/form/div[3]/button");
    public static final Target Txt_password = Target.the("ingrese contraseña").locatedBy("//*[@id=\"password\"]");

    public static final Target Btn_login1 = Target.the("ingrese confirmacion de contraseña").locatedBy("//*[@id=\"root\"]/div/div/div/div[2]/div[1]/div/div/div/div/div/div/form/div[2]/button");
    public static final Target Btn_confir = Target.the("manterner precionado el boton").locatedBy("//*[@id=\"WuFnWiPOmwJJXpF\"]");

}
