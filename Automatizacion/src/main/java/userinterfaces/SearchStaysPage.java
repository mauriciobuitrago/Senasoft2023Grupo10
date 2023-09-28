package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchStaysPage {

    public static final Target Txt_where_are_you_going = Target.the("ingresa  un lugar").located(By.cssSelector("#indexsearch > div.hero-banner-searchbox > div > form > div.ffb9c3d6a3.db27349d3a.cc9bf48a25 > div:nth-child(1) > div"));

    public static final Target BTN_Selector = Target.the(" Boton de Buscar  ").locatedBy("#indexsearch > div.hero-banner-searchbox > div > form > div.ffb9c3d6a3.db27349d3a.cc9bf48a25 > div:nth-child(1) > div > div > div.a7631de79e > div > ul > li:nth-child(2) > div");


    public static final Target BTN_Checkin_checkout = Target.the("ingresa llegada y salida ").locatedBy("//*[@id=\"indexsearch\"]/div[2]/div/form/div[1]/div[2]/div/div[1]/button[1]");

    public static final Target Txt_entrada = Target.the("ingresa email").located(By.cssSelector("#calendar-searchboxdatepicker > div > div.a10b0e2d13.efea941f13 > div > div:nth-child(2) > table > tbody > tr:nth-child(2) > td:nth-child(2)"));
    public static final Target Txt_salida = Target.the("ingresa email").located(By.cssSelector("#calendar-searchboxdatepicker > div > div.a10b0e2d13.efea941f13 > div > div:nth-child(2) > table > tbody > tr:nth-child(5) > td:nth-child(3)"));
    public static final Target MENU = Target.the("ingresa email").located(By.cssSelector("#indexsearch > div.hero-banner-searchbox > div > form > div.ffb9c3d6a3.db27349d3a.cc9bf48a25 > div:nth-child(3)"));
    public static final Target Agregar_adulto = Target.the("ingresa email").located(By.cssSelector("#indexsearch > div.hero-banner-searchbox > div > form > div.ffb9c3d6a3.db27349d3a.cc9bf48a25 > div:nth-child(3) > div > div > div > div > div:nth-child(1) > div.bfb38641b0 > button.a83ed08757.c21c56c305.f38b6daa18.d691166b09.ab98298258.deab83296e.bb803d8689.f4d78af12a"));
    public static final Target Agregar_nilo = Target.the("ingresa email").located(By.cssSelector("#indexsearch > div.hero-banner-searchbox > div > form > div.ffb9c3d6a3.db27349d3a.cc9bf48a25 > div:nth-child(3) > div > div > div > div > div:nth-child(2) > div.bfb38641b0 > button.a83ed08757.c21c56c305.f38b6daa18.d691166b09.ab98298258.deab83296e.bb803d8689.f4d78af12a"));
    public static final Target Agregar_Selec = Target.the("ingresa email").located(By.cssSelector("#indexsearch > div.hero-banner-searchbox > div > form > div.ffb9c3d6a3.db27349d3a.cc9bf48a25 > div:nth-child(3) > div > div > div > div > div:nth-child(3) > div.bfb38641b0 > button.a83ed08757.c21c56c305.f38b6daa18.d691166b09.ab98298258.deab83296e.bb803d8689.f4d78af12a"));
    public static final Target Agregar_Abitacion = Target.the("ingresa email").located(By.cssSelector("#indexsearch > div.hero-banner-searchbox > div > form > div.ffb9c3d6a3.db27349d3a.cc9bf48a25 > div:nth-child(3) > div > div > div > div > div:nth-child(5) > div.bfb38641b0 > button.a83ed08757.c21c56c305.f38b6daa18.d691166b09.ab98298258.deab83296e.bb803d8689.f4d78af12a"));
    public static final Target btn_listo = Target.the("ingresa email").located(By.cssSelector("#indexsearch > div.hero-banner-searchbox > div > form > div.ffb9c3d6a3.db27349d3a.cc9bf48a25 > div:nth-child(3) > div > div > div > button"));
    public static final Target btn_Buscar = Target.the("Btn Buscar").located(By.cssSelector("#indexsearch > div.hero-banner-searchbox > div > form > div.ffb9c3d6a3.db27349d3a.cc9bf48a25 > div:nth-child(4) > button"));
    public static final Target validacion = Target.the("Btn Buscar").locatedBy("//*[@id=\"bodyconstraint-inner\"]/div[4]/div/div[2]/div[3]/div[1]/div[3]/div[1]/h2");


}




