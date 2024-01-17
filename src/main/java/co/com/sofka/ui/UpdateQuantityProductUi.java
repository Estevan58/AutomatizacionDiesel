package co.com.sofka.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UpdateQuantityProductUi extends PageObject {
    public static final Target AumentarCantidad = Target
            .the("AumentarCantidad")
            .located(By.xpath("/html/body/div[5]/div[3]/div[1]/div[1]/div[2]/table/tbody/tr[1]/td[5]/a[2]"));

    public static final Target Showcantidad = Target
            .the("Showcantidad")
            .located(By.xpath("/html/body/div[5]/div[3]/div[1]/div[1]/div[2]/table/tbody/tr[1]/td[5]/input"));

}
