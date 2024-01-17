package co.com.sofka.stepdefinitions.ApiRest;

import co.com.sofka.SetupApis;
import co.com.sofka.tasks.ApiRest.SendPostRequest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static co.com.sofka.tasks.ApiRest.GetListResultApi.getListResult;

public class AuthStepDefinition extends SetupApis {

    @Given("que el usuario de la prueba de sangre desea conocer el resultado")
    public void queElUsuarioDeLaPruebaDeSangreDeseaConocerElResultado() {
        try {
            actorCallAnAPiRest();
        }catch (Exception e){
            System.out.println("Error "+e.getMessage());
        }
    }
    @When("hago la petición de tipo Post")
    public void hagoLaPeticiónDeTipoGet() {
        try {
            actor.attemptsTo(
                    SendPostRequest.sendTokenRequest()
                            .withTheResource("/Token")
                            .andTheBody("{\n" +
                                    "    \"username\": \"Jhorman\",\n" +
                                    "    \"password\": \"123456\"\n" +
                                    "}")
            );

        }catch (Exception e){
            System.out.println("Error "+e.getMessage());
        }

    }
    @Then("un json con la información del usuario")
    public void unJsonConLaInformaciónDelUsuario() {
        try {
            actor.attemptsTo(
                    getListResult()
                            .withTheResource("/Products")
            );
        }catch (Exception e){
            System.out.println("Error "+e.getMessage());
        }

    }
}
