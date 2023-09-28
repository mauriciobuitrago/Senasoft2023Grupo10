package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class topbarcomponent {

    public static final Target Btn_login = Target.the("dar click en el boton de logiarse").locatedBy("//*[@id=\"b2indexPage\"]/div[2]/div/header/nav[1]/div[2]/div/a");
    public static final Target Btn_register = Target.the("dar click en el boton de registrarse").located(By.cssSelector("#b2indexPage > div:nth-child(4) > div > header > nav.c20fd9b542 > div.aca0ade214.aaf30230d9.c2931f4182.e7d9f93f4d.faf8b5d9a5 > a.a83ed08757.c21c56c305.bf0537ecb5.ab98298258.deab83296e.af7297d90d.js-header-login-link"));
    public static  final Target validarlogin = Target.the("vaidar usuario").located(By.cssSelector("#root > div > div > div > div.app > div.access-container.bui_font_body > div > div > div > div > div > div > form > div.bui-spacer--large.bui-u-margin-top--24 > div.bui-spacer--largest"));
    public static  final Target Btn_flight = Target.the("ingresar a vuelos").located(By.cssSelector("#flights"));
}
