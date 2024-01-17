package co.com.sofka.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://co.diesel.com/")
public class PageInit extends PageObject {
    public static final Target BUTTON_CAR = Target
            .the("TEXTO DE CONFIRMACION DE ADD PRODUCT")
            .located(By.xpath("/html/body/div[2]/div/div[1]/div/div[1]/div/div/div/div[2]/div/div/div[2]/div/div/div[5]"));

    public static final Target TEXT_EMPTY_CAT= Target
        .the("TEXTO DE CONFIRMACION DE ADD PRODUCT")
        .located(By.xpath("//p[contains(text(),'Tu carrito está vacío.')]"));


}
