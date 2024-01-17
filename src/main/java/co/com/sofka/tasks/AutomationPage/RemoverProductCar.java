package co.com.sofka.tasks.AutomationPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.time.Duration;

import static co.com.sofka.ui.RemoverPoductCar.ButtonRemover;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class RemoverProductCar implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(ButtonRemover, isClickable()).forNoMoreThan(Duration.ofSeconds(200)),
                Click.on(ButtonRemover)
        );
    }

    public static RemoverProductCar removerProductCar() {
        return new RemoverProductCar();
    }
}
