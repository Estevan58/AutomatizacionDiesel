package co.com.sofka.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://co.diesel.com/morral-no-portatil-para-hombre-farb-29226-x08363p3889/p")
public class AddMultipleProductUi extends PageObject {

    public static final Target COMPLETATULOOK = Target
            .the("COMPLETATULOOK")
            .located(By.xpath("//span[contains(text(), 'COMPLETA TU LOOK')]"));


    public static final Target AddProduct1 = Target
            .the("AddProduct1")
            .located(By.xpath("/html/body/div[2]/div/div[1]/div/div/div/div[2]/div/div[2]/div/section/div/div[2]/div/div[3]/div/div[3]/div/div[2]/ul/li[4]/section/a/article/div[2]/div/div/button/div"));

    public static final Target AddProduct2 = Target
            .the("AddProduct2")
            .located(By.xpath("/html/body/div[2]/div/div[1]/div/div/div/div[2]/div/div[2]/div/section/div/div[2]/div/div[3]/div/div[3]/div/div[2]/ul/li[5]/section/a/article/div[2]/div/div/button/div"));

    public static final Target Regresar = Target
            .the("Regresar")
            .located(By.cssSelector("body > div.vtex-minicart-2-x-drawer.vtex-minicart-2-x-opened.right-0.fixed.top-0.bottom-0.bg-base.z-999.flex.flex-column > div > div.flex.vtex-minicart-2-x-closeIconContainer > button"));

    public static final Target HOMBRE = Target
            .the("HOMBRE")
            .located(By.xpath("/html/body/div[2]/div/div[1]/div/div[1]/div/div/div/div[2]/div/div/div[2]/div/div/div[1]/div/div/nav/ul/button[1]/li/div/span"));

    public static final Target CALZADO = Target
            .the("CALZADO")
            .located(By.xpath("//div[contains(text(), 'Ver todo')]"));

    public static final Target TENIS = Target
            .the("CALZADO")
            .located(By.xpath("menu-item-category-apparel-accessories"));




}
