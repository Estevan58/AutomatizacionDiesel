package co.com.sofka.stepdefinitions.Page;

import co.com.sofka.Setup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static co.com.sofka.tasks.AutomationPage.PaymentProcessTasks.paymentProcessTasks;
import static co.com.sofka.tasks.AutomationPage.PaymentprocessOne.paymentprocessOne;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class PaymentProcess extends Setup {

    @When("el usuario procede al pago")
    public void elUsuarioProcedeAlPago() {
       try {
        theActorInTheSpotlight().wasAbleTo(
                paymentprocessOne()
        );
           }catch (Exception e){
               System.out.printf("errror"+ e.getMessage());
               quitarDriver();
           }
    }

    @And("completa la información de envío y pago")
    public void completaLaInformacionDeEnvioYPago() {
       try {
           theActorInTheSpotlight().wasAbleTo(
                   paymentProcessTasks()
           );
           }catch (Exception e){
               System.out.printf("errror"+ e.getMessage());
               quitarDriver();
           }
    }

    @Then("la orden de compra se debería realizar con éxito")
    public void laOrdenDeCompraSeDeberiaRealizarConExito() {
        quitarDriver();
    }


}
