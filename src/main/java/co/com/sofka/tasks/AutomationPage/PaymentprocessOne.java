package co.com.sofka.tasks.AutomationPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.sofka.ui.PaymentProcessUi.*;

public class PaymentprocessOne implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BUTTONCONTINUAR),
                Click.on(FINALIZARCOMPRA),
                Enter.theValue("Examplejsjs@gmail.com").into(INGRESAREMAIL),
                Click.on(CONTINUARENINGRESAREMAIL)
                );
}




public static PaymentprocessOne paymentprocessOne() {
    return new PaymentprocessOne();
}}