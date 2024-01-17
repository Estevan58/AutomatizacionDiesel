package co.com.sofka.questions.AutomationPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.sofka.ui.PageDetailsProduct.TEXT_PRICE_PRODUCT;

public class QuestionPriceProduct implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return TEXT_PRICE_PRODUCT.resolveFor(actor).getText();
    }

    public static QuestionPriceProduct questionPriceProduct(){
        return new QuestionPriceProduct();
    }
}
