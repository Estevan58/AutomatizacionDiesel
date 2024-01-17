package co.com.sofka.stepdefinitions.Page;

import co.com.sofka.Setup;
import io.cucumber.java.en.Then;

import static co.com.sofka.questions.AutomationPage.QuestionColorProduct.questionColorProduct;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class VerifyColorProductStepDefinition extends Setup {
    @Then("deberia poder ver el color del producto")
    public void deberiaPoderVerElColorDelProducto() {
        try{
            theActorInTheSpotlight().should(seeThat(
                    questionColorProduct(), equalTo("Blanco")
            ));
        }catch (Exception e){
            System.out.printf("errror"+ e.getMessage());
            quitarDriver();
        }

    }
}
