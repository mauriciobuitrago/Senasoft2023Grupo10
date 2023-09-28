package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class topbarcomponent {

    public static final Target Btn_login = Target.the("dar click en el boton de logiarse").locatedBy("//*[@id=\"b2indexPage\"]/div[2]/div/header/nav[1]/div[2]/div/a");
    public static  final Target validarlogin = Target.the("vaidar usuario").located(By.cssSelector("#root > div > div > div > div.app > div.access-container.bui_font_body > div > div > div > div > div > div > form > div.bui-spacer--large.bui-u-margin-top--24 > div.bui-spacer--largest"));
    public static  final Target Btn_flight = Target.the("ingresar a vuelos").located(By.cssSelector("#flights"));
}
