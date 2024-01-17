package co.com.sofka.stepdefinitions.ApiSoap;

import co.com.sofka.SetupApis;
import co.com.sofka.tasks.ApiSoap.ServiceDivide;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class ApiSoapStepDefinition extends SetupApis {
    @Given("que el servicio DivideInteger está disponible")
    public void queElServicioDivideIntegerEstáDisponible() {
        try {
            actorCallAnAPiSoap();
        }catch (Exception e){
            System.out.println("Error "+e.getMessage());
        }

    }
    @When("se realiza una solicitud para dividir dos enteros con valores {int} y {int}")
    public void seRealizaUnaSolicitudParaDividirDosEnterosConValoresY(Integer int1, Integer int2) {
        try {
            actor.attemptsTo(
                    ServiceDivide.Division(int1,int2)
            );
        }catch (Exception e){
            System.out.println("Error "+e.getMessage());
        }
    }
    @Then("el resultado debe ser {int}")
    public void elResultadoDebeSer(Integer int1) {

    }


}
