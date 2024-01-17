package co.com.sofka.tasks.AutomationPage;

import co.com.sofka.ui.AddMultipleProductUi;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.time.Duration;

import static co.com.sofka.ui.AddMultipleProductUi.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class AddMultipleProduct implements Task {
private AddMultipleProductUi addMultipleProductUi;
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                //WaitUntil.the(HOMBRE, isClickable()).forNoMoreThan(Duration.ofSeconds(10)),
                //Click.on(HOMBRE),
                //Click.on(CALZADO),

               // WaitUntil.the(CALZADO, isClickable()).forNoMoreThan(Duration.ofSeconds(10)),
                Open.browserOn(addMultipleProductUi),
                Scroll.to(COMPLETATULOOK),
                WaitUntil.the(AddProduct1, isClickable()).forNoMoreThan(Duration.ofSeconds(10)),
                Click.on(AddProduct1),
                //WaitUntil.the(Regresar, isClickable()).forNoMoreThan(Duration.ofSeconds(10)),
                Click.on(Regresar),
                WaitUntil.the(AddProduct2, isClickable()).forNoMoreThan(Duration.ofSeconds(10)),
                Click.on(AddProduct2)
        );
    }

    public static AddMultipleProduct addMultipleProduct() {
        return new AddMultipleProduct();
    }
}
