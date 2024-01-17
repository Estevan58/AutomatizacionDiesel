package co.com.sofka.stepdefinitions.Page;

import co.com.sofka.Setup;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static co.com.sofka.questions.AutomationPage.QuestionNameProduct.questionNameProduct;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class VerifyNameProductStepDefinition extends Setup {
    @When("Visualiza la informacion del producto")
    public void visualizaLaInformacionDelProducto() {
        try{

        }catch (Exception e){
            System.out.printf("errror"+ e.getMessage());
            quitarDriver();
        }
    }
    @Then("deberia poder ver el nombre correctos del producto")
    public void deberiaPoderVerElNombreCorrectosDelProducto() {
        try{
            theActorInTheSpotlight().should(seeThat(
                    questionNameProduct(), equalTo("Morral No Portatil Para Hombre Farb 29226")
            ));
            quitarDriver();
        }catch (Exception e){
            System.out.printf("errror"+ e.getMessage());
            quitarDriver();
        }

    }
}
