package co.com.sofka.questions.AutomationPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.sofka.ui.SearchProduct.RESULTADOH1;


public class ShowResulSearch implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return RESULTADOH1.resolveFor(actor).getText();
    }

    public static ShowResulSearch showResulSearch(){
        return new ShowResulSearch();
    }
}
