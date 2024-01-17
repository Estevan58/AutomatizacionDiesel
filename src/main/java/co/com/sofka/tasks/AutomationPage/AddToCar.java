package co.com.sofka.tasks.AutomationPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.sofka.ui.PageDetailsProduct.ADDTOCAR_BUTTON;

public class AddToCar implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ADDTOCAR_BUTTON)
        );
    }

    public static AddToCar addToCar(){
        return new AddToCar();
    }
}
