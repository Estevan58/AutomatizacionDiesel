package co.com.sofka.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RemoverPoductCar extends PageObject {
    public static final Target ButtonRemover = Target
            .the("ButtonRemover")
            .located(By.id("remove-button-110109"));

}
