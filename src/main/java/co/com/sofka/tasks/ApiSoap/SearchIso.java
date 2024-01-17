package co.com.sofka.tasks.ApiSoap;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Post;
import net.serenitybdd.screenplay.rest.questions.LastResponse;

import java.util.HashMap;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SearchIso implements Task {

    private final String Pais;

    public SearchIso(String pais) {
        Pais = pais;
    }


    public static Performable SearchCountry(String pais) {
        return instrumented(SearchIso.class, pais);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String resource = "/websamples.countryinfo/CountryInfoService.wso";

        String bodyRequest = String.format(
                "<soap:Envelope xmlns:soap=\"http://www.w3.org/2003/05/soap-envelope\" xmlns:web=\"http://www.oorsprong.org/websamples.countryinfo\">\n" +
                        "   <soap:Header/>\n" +
                        "   <soap:Body>\n" +
                        "      <web:CountryISOCode>\n" +
                        "         <web:sCountryName>%d</web:sCountryName>\n" +
                        "      </web:CountryISOCode>\n" +
                        "   </soap:Body>\n" +
                        "</soap:Envelope>",
                Pais
        );

        HashMap<String, Object> headers = new HashMap<>();
        headers.put("Content-type","text/xml;charset=UTF-8");
        headers.put("SOAPAction", "http://webservices.oorsprong.org");

        actor.attemptsTo(
                Post.to(resource)
                        .with(
                                req ->
                                        req.headers(headers)
                                                .body(bodyRequest)

                        )
        );
        System.out.println(LastResponse.received().answeredBy(actor).asString());
    }
}

