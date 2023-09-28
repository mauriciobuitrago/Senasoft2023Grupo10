package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class rentalpage  {

    public static final Target Txt_buscar_recogida = Target.the("ingresa lugar de recogida").located(By.cssSelector("#b2runway_internal_actionPage > div:nth-child(7) > main > div:nth-child(2) > div > div > div > div > div > div.sbc-traveler-bar__background.bgui-u-pa-medium > div > div.sb-u-flex-grow\\@l.sb-u-width-auto\\@l.suggestions-nowrap.bgui-u-1\\/1.LPCM_9a40e6ff.LPCM_79f47323 > div > div.pickup-location.bgui-u-1\\/1.LPCM_9a40e6ff.LPCM_79f47323 > span > div > div > div > div.LPCM_35550613.LPCM_4c616635.sbc-fl-text-input__body > div > label"));
    public static final Target Txt_buscar_recogida2 = Target.the("ingresa lugar de recogida").located(By.cssSelector("#searchbox-toolbox-fts-pickup"));
    public static final Target Txt_buscar_ = Target.the("click en buscar").located(By.cssSelector("#b2runway_internal_actionPage > div:nth-child(7) > main > div:nth-child(2) > div > div > div > div > div > div.sbc-traveler-bar__background.bgui-u-pa-medium > div > div:nth-child(2) > div > div.submit-button-container > button"));
    public static final Target selecionar = Target.the("click selecionar").located(By.cssSelector("#searchbox-toolbox-fts-pickup-suggestion-0 > div"));

}
