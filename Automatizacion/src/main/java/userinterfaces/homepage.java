package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class homepage {
    public static final Target Btn_anuncio = Target.the("ilimina ununcio").located(By.cssSelector("#b2indexPage > div.b9720ed41e.cdf0a9297c > div > div > div > div.dd5dccd82f > div.ffd93a9ecb.dc19f70f85.eb67815534.e91f709929 > div"));
    public static final Target Btn_acceder = Target.the("ingresa por el anuncio").located(By.cssSelector("#b2indexPage > div.b9720ed41e.cdf0a9297c > div > div > div > div.c1af8b38aa > div > a"));
}
