package co.com.sofka.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class SearchProduct extends PageObject {

    public static final Target SEARCH = Target
            .the("SEARCH")
            .located(By.xpath("/html/body/div[2]/div/div[1]/div/div[1]/div/div/div/div[2]/div/div/div[2]/div/div/div[4]"));

    public static final Target SEARCHINPUT = Target
            .the("SEARCHINPUT")
            .located(By.id("downshift-0-input"));


    public static final Target RESULTADOH1 = Target
            .the("RESULTADOH1")
            .located(By.xpath("//h1"));

}
