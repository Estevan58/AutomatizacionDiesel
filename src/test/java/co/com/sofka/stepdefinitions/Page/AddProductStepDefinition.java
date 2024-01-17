package co.com.sofka.stepdefinitions.Page;

import co.com.sofka.Setup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static co.com.sofka.questions.AutomationPage.QuestionAddedAProduct.questionAddedAProduct;
import static co.com.sofka.tasks.AutomationPage.AddToCar.addToCar;
import static co.com.sofka.tasks.AutomationPage.OpenPageDetailsProduct.openPageDetailsProduct;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class AddProductStepDefinition extends Setup {

    @Given("que he accedido a la pagina de detalles del producto")
    public void queHeAccedidoALaPaginaDeDetallesDelProducto() {
        try{
            actorSetupTheBrowser("Jhorman");
            theActorInTheSpotlight().wasAbleTo(
                    openPageDetailsProduct()
            );
        }catch (Exception e){
            System.out.printf("errror"+ e.getMessage());
            quitarDriver();
        }
    }
    @When("se anada un producto")
    public void seAnadaUnProducto() {
        try{
            theActorInTheSpotlight().wasAbleTo(
                    addToCar()
            );
        }catch (Exception e){
            System.out.printf("errror"+ e.getMessage());
            quitarDriver();
        }
    }
    @Then("el producto deberia ser agregado al carrito")
    public void elProductoDeberiaSerAgregadoAlCarrito() {
        try{
            theActorInTheSpotlight().should(seeThat(
                    questionAddedAProduct(), equalTo("¡Acabas de agregar un producto!")
            ));
        }catch (Exception e){
            System.out.printf("errror"+ e.getMessage());
            quitarDriver();
        }
    }

}
