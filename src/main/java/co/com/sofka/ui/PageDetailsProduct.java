package co.com.sofka.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://co.diesel.com/morral-no-portatil-para-hombre-farb-29226-x08363p3889/p")
public class PageDetailsProduct extends PageObject {
    public static final Target ADDTOCAR_BUTTON= Target
            .the("AÑADIR A CARRITO")
            .located(By.xpath("/html/body/div[2]/div/div[1]/div/div/div/div[2]/div/div[1]/div/section/div/div/div/div[2]/div/div[9]/div/div/div/button/div"));
    public static final Target TEXT_ADDED_A_PRODUCT_BUTTON= Target
            .the("TEXTO DE CONFIRMACION DE ADD PRODUCT")
            .located(By.xpath("//p[contains(text(), '¡Acabas de agregar un producto!')]"));
    public static final Target TEXT_NAME_PRODUCT_BUTTON= Target
            .the("NOMBRE DEL PRODUCTO")
            .located(By.xpath("//span[contains(text(),'Morral No Portatil Para Hombre Farb 29226')]"));
    public static final Target TEXT_COLOR_PRODUCT= Target
            .the("NOMBRE DEL PRODUCTO")
            .located(By.xpath("/html/body/div[2]/div/div[1]/div/div/div/div[2]/div/div[1]/div/section/div/div/div/div[2]/div/div[6]/div/div[1]/div/div[1]/span[3]"));
    public static final Target TEXT_PRICE_PRODUCT= Target
            .the("NOMBRE DEL PRODUCTO")
            .located(By.xpath(" /html/body/div[2]/div/div[1]/div/div/div/div[2]/div/div[1]/div/section/div/div/div/div[2]/div/div[3]/div/div/div[2]/div/div/div/span/span"));



}
