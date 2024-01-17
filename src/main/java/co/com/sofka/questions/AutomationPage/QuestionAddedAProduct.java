package co.com.sofka.questions.AutomationPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.sofka.ui.PageDetailsProduct.TEXT_ADDED_A_PRODUCT_BUTTON;

public class QuestionAddedAProduct implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return TEXT_ADDED_A_PRODUCT_BUTTON.resolveFor(actor).getText();
    }

    public static QuestionAddedAProduct questionAddedAProduct(){
        return new QuestionAddedAProduct();
    }
}
