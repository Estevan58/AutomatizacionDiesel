package co.com.sofka.questions.AutomationPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.sofka.ui.PageDetailsProduct.TEXT_NAME_PRODUCT_BUTTON;

public class QuestionNameProduct implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return TEXT_NAME_PRODUCT_BUTTON.resolveFor(actor).getText();
    }
    static public QuestionNameProduct questionNameProduct(){
        return new QuestionNameProduct();
    }
}
