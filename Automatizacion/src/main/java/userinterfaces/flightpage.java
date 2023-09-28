package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class flightpage {

    public static final Target Rtn_single_trip = Target.the("click en el radio de solo ida").located(By.cssSelector("#basiclayout > div > div > div.css-1niqckn > div > div > div > div > div.css-7wh13m > div:nth-child(1) > div > fieldset > div > div:nth-child(2) > label"));
    public static final Target Btn_exitflight = Target.the("preciona donde sale el vuelo").located(By.cssSelector("#basiclayout > div > div > div.css-1niqckn > div > div > div > div > div.css-7wh13m > div:nth-child(2) > div > div > div > div > div.css-lgj0h8 > div > button:nth-child(1)"));
    public static final Target Btn_arrivalflight = Target.the("preciona donde llega el vuelo").located(By.cssSelector("#basiclayout > div > div > div.css-1niqckn > div > div > div > div > div.css-7wh13m > div:nth-child(2) > div > div > div > div > div.css-lgj0h8 > div > button:nth-child(3)"));
    public static final Target Txt_exitflight = Target.the("ingres lugar de salida del vuelo").located(By.cssSelector("#\\:Rhdl3b9\\: > div > div > div > div > div > div > div.css-n1d439.css-18e6ulj > div > div > div > div > input"));
    public static final Target Txt_arrivalflight = Target.the("ingres lugar de llegada del vuelo").located(By.cssSelector("#\\:Rjdl3b9\\: > div > div > div > div > div > div > div.css-n1d439.css-18e6ulj > div > div > div > div > input"));
    public static final Target Btn_select_airport_exit = Target.the("seleciona el aeropuerto de salidad").located(By.cssSelector("#listbox > li:nth-child(1)"));
    public static final Target Btn_select_airport_arrival = Target.the("seleciona el aeropuerto de llegada").located(By.cssSelector("#listbox > li:nth-child(1)"));
    public static final Target Btn_fechaespecifica = Target.the("seleciona la fecha del vuelo").located(By.cssSelector("#\\:R2ll3b9\\: > div > div > div > div > div > div > div > div > div:nth-child(1) > table > tbody > tr:nth-child(3) > td:nth-child(5) > span"));
    public static final Target Btn_fecha = Target.the("seleciona la fecha ").located(By.cssSelector("#basiclayout > div > div > div.css-1niqckn > div > div > div > div > div.css-7wh13m > div:nth-child(2) > div > div > div > div > div.css-8atqhb > button"));
    public static final Target Btn_buscar = Target.the("seleciona la fecha ").located(By.cssSelector("#basiclayout > div > div > div.css-1niqckn > div > div > div > div > div.css-7wh13m > div:nth-child(2) > div > div > button"));
    public static final Target validar_vuelo = Target.the("validad si se hizo una busquedad exitosa de un vuelo").located(By.cssSelector("#basiclayout > div > div > div.css-qe6ggh > div > div > div > div > div.css-hs3ck0 > div > div.css-iulg13 > div > div.css-io4ta2 > div > h2"));
    public static final Target validar_vuelo_faile = Target.the("validad si se hizo una busquedad exitosa de un vuelo").located(By.cssSelector("#basiclayout > div > div > div.css-1niqckn > div > div > div > div > div.css-7wh13m > div:nth-child(1) > div > button > div > div"));

    public static final Target Btn_passengers = Target.the("se seleciona pasajeros").located(By.cssSelector("#basiclayout > div > div > div.css-1niqckn > div > div > div > div > div.css-7wh13m > div:nth-child(1) > div > button"));
    public static final Target Btn_passengers_children = Target.the("se seleciona la cantidad de pasajeros niños ").located(By.cssSelector("#\\:Rjd3b9\\: > div > div > div > div > div > div.css-6yc6o0 > div > div:nth-child(2) > div > div.InputStepper-module__wrapper___ITjSz > button.Actionable-module__root___o3y3\\+.Button-module__root___2Z2KR.Button-module__root--variant-tertiary___cjBJU.Button-module__root--icon-only___GOysd.Button-module__root--size-medium___\\+UaTJ.Button-module__root--wide-false___V33Sh.Button-module__root--variant-tertiary-action___JVws6.InputStepper-module__add___XhOwU"));


}
