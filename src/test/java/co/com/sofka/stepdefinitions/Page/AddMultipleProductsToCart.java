package co.com.sofka.stepdefinitions.Page;

import co.com.sofka.Setup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


import static co.com.sofka.tasks.AutomationPage.AddMultipleProduct.addMultipleProduct;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AddMultipleProductsToCart extends Setup {

    @Given("que el usuario ha buscado y seleccionado varios productos")
    public void queElUsuarioHaBuscadoYSeleccionadoVariosProductos() {


        try{
            actorSetupTheBrowser("Diesel");
            theActorInTheSpotlight().wasAbleTo(
                    addMultipleProduct()
            );
        }catch (Exception e){
            System.out.printf("errror"+ e.getMessage());
            quitarDriver();
        }



    }

    @When("el usuario agrega múltiples productos al carrito")
    public void elUsuarioAgregaMultiplesProductosAlCarrito() {
        try{
            theActorInTheSpotlight().wasAbleTo(

            );
        }catch (Exception e){
            System.out.printf("errror"+ e.getMessage());
            quitarDriver();
        }


    }

    @Then("todos los productos seleccionados se agregarían al carrito correctamente")
    public void todosLosProductosSeleccionadosSeAgregarianAlCarritoCorrectamente() {

        quitarDriver();
    }


}
