package co.com.sofka.questions.AutomationPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.sofka.ui.PageInit.TEXT_EMPTY_CAT;

public class QuestionEmptyCar implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return TEXT_EMPTY_CAT.resolveFor(actor).getText();
    }

    public static QuestionEmptyCar questionEmptyCar(){
        return new QuestionEmptyCar();
    }
}
