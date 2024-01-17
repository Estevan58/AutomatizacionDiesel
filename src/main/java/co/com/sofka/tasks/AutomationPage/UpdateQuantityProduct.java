package co.com.sofka.tasks.AutomationPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.time.Duration;

import static co.com.sofka.ui.PaymentProcessUi.BUTTONCONTINUAR;
import static co.com.sofka.ui.UpdateQuantityProductUi.AumentarCantidad;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class UpdateQuantityProduct implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BUTTONCONTINUAR, isClickable()).forNoMoreThan(Duration.ofSeconds(10)),
                Click.on(BUTTONCONTINUAR),
                WaitUntil.the(AumentarCantidad, isClickable()).forNoMoreThan(Duration.ofSeconds(10)),
                Click.on(AumentarCantidad)
        );
    }

    public static UpdateQuantityProduct updateQuantityProduct() {
        return new UpdateQuantityProduct();
    }
}
