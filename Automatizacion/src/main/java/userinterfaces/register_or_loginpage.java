package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class register_or_loginpage {


    public static final Target Txt_email = Target.the("ingresa email").locatedBy("//*[@id=\"username\"]");
    public static final Target Btn_following = Target.the("oprime siguiente").locatedBy("//*[@id=\"root\"]/div/div/div/div[2]/div[1]/div/div/div/div/div/div/form/div[3]/button");
    public static final Target Txt_password = Target.the("ingrese contraseña").locatedBy("//*[@id=\"password\"]");
    public static final Target Txt_new_password = Target.the("ingrese nueva contraseña").located(By.cssSelector("#new_password"));
    public static final Target Txt_confir_password = Target.the("confirme  contraseña").located(By.cssSelector("#confirmed_password"));
    public static final Target Btn_create_Account = Target.the("crear cuenta").located(By.cssSelector("#root > div > div > div > div.app > div.access-container.bui_font_body > div > div > div > div > div > div > form > button"));

    public static final Target Btn_login1 = Target.the("ingrese confirmacion de contraseña").locatedBy("//*[@id=\"root\"]/div/div/div/div[2]/div[1]/div/div/div/div/div/div/form/div[2]/button");


}
