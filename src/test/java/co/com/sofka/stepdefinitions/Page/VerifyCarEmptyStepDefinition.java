package co.com.sofka.stepdefinitions.Page;

import co.com.sofka.Setup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static co.com.sofka.questions.AutomationPage.QuestionEmptyCar.questionEmptyCar;
import static co.com.sofka.tasks.AutomationPage.GoToCar.goToCar;
import static co.com.sofka.tasks.AutomationPage.OpenPageInit.openPageInit;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class VerifyCarEmptyStepDefinition extends Setup {
    @Given("que el usuario se encuentra en la pagina de inicio")
    public void queElUsuarioSeEncuentraEnLaPaginaDeInicio() {
        try{
            actorSetupTheBrowser("Jhorman");
            theActorInTheSpotlight().wasAbleTo(
                    openPageInit()
            );
        }catch (Exception e){
            System.out.printf("errror"+ e.getMessage());
            quitarDriver();
        }
    }
    @When("el usuario va al carrito")
    public void elUsuarioVaAlCarrito() {
        try{
            theActorInTheSpotlight().wasAbleTo(
                    goToCar()
            );
        }catch (Exception e){
            System.out.printf("errror"+ e.getMessage());
            quitarDriver();
        }

    }
    @Then("el carrito deberia estar vacio")
    public void elCarritoDeberiaEstarVacio() {
        try{
            theActorInTheSpotlight().should(seeThat(
                    questionEmptyCar(), equalTo("Tu carrito está vacío.")
            ));
        }catch (Exception e){
            System.out.printf("errror"+ e.getMessage());
            quitarDriver();
        }
    }

}
