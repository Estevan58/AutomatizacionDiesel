package co.com.sofka.questions.AutomationPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;


import static co.com.sofka.ui.UpdateQuantityProductUi.Showcantidad;

public class ShowQuantityUpdate implements Question<Integer> {
    @Override
    public Integer answeredBy(Actor actor) {
        // Obtener el valor del atributo 'value' del elemento input
        String quantityText = Showcantidad.resolveFor(actor).getAttribute("value");

        // Convierte el texto a un número entero antes de devolverlo
        return Integer.parseInt(quantityText);
    }

    public static ShowQuantityUpdate showQuantityUpdate() {
        return new ShowQuantityUpdate();
    }
}
