package co.com.sofka.questions.AutomationPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.sofka.ui.PageDetailsProduct.TEXT_COLOR_PRODUCT;

public class QuestionColorProduct implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return TEXT_COLOR_PRODUCT.resolveFor(actor).getText();
    }

    public static QuestionColorProduct questionColorProduct(){
        return new QuestionColorProduct();
    }
}
