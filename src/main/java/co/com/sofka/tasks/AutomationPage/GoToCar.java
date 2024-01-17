package co.com.sofka.tasks.AutomationPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.sofka.ui.PageInit.BUTTON_CAR;

public class GoToCar implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BUTTON_CAR)
        );
    }

    public static GoToCar goToCar(){
        return new GoToCar();
    }
}
