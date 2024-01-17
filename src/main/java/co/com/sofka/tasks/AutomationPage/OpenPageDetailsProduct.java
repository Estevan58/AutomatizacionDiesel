package co.com.sofka.tasks.AutomationPage;

import co.com.sofka.ui.PageDetailsProduct;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class OpenPageDetailsProduct implements Task {
    private PageDetailsProduct pageDetailsProduct;
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn(pageDetailsProduct)
        );
    }
    public static OpenPageDetailsProduct openPageDetailsProduct(){
        return new OpenPageDetailsProduct();
    }
}
