package co.com.sofka.stepdefinitions.Page;

import co.com.sofka.Setup;
import io.cucumber.java.en.Then;

import static co.com.sofka.questions.AutomationPage.QuestionPriceProduct.questionPriceProduct;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class VerifyPriceProductStepDefinition extends Setup {
    @Then("Revisa el precio del producto")
    public void revisaElPrecioDelProducto() {
        try{
            theActorInTheSpotlight().should(seeThat(
                    questionPriceProduct(), equalTo("$ 524.930,00")
            ));
            quitarDriver();
        }catch (Exception e){
            System.out.printf("errror"+ e.getMessage());
            quitarDriver();
        }

    }
}
