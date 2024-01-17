package co.com.sofka.tasks.ApiSoap;

        import net.serenitybdd.screenplay.Actor;
        import net.serenitybdd.screenplay.Performable;
        import net.serenitybdd.screenplay.Task;
        import net.serenitybdd.screenplay.rest.interactions.Post;
        import net.serenitybdd.screenplay.rest.questions.LastResponse;

        import java.util.HashMap;

        import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ServiceDivide implements Task {

    private final Integer int1;
    private final Integer int2;

    public ServiceDivide(Integer int1, Integer int2) {
        this.int1 = int1;
        this.int2 = int2;
    }

    public static Performable Division(Integer int1, Integer int2) {
        return instrumented(ServiceDivide.class, int1, int2);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        if (int1 == null || int2 == null) {
            throw new IllegalArgumentException("int1 and int2 must be non-null");
        }

        String resource = "/csp/samples/SOAP.Demo.cls";

        String bodyRequest = String.format(
                "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:tem=\"http://tempuri.org\">\n" +
                        "   <soapenv:Header/>\n" +
                        "   <soapenv:Body>\n" +
                        "      <tem:DivideInteger>\n" +
                        "         <!--Optional:-->\n" +
                        "         <tem:Arg1>%d</tem:Arg1>\n" +
                        "         <!--Optional:-->\n" +
                        "         <tem:Arg2>%d</tem:Arg2>\n" +
                        "      </tem:DivideInteger>\n" +
                        "   </soapenv:Body>\n" +
                        "</soapenv:Envelope>",
                int1, int2
        );

        HashMap<String, Object> headers = new HashMap<>();
        headers.put("Content-type", "text/xml;charset=UTF-8");
        headers.put("SOAPAction", "http://tempuri.org/SOAP.Demo.DivideInteger");

        actor.attemptsTo(
                Post.to(resource)
                        .with(
                                req ->
                                        req.headers(headers)
                                                .body(bodyRequest)
                        )
        );

        // Aquí puedes utilizar aserciones para verificar la respuesta en lugar de imprimir en la consola
        // Por ejemplo: actor.should(seeThat(LastResponse.received(), containsString("algo")));

        // Imprimir la respuesta solo para fines de depuración (si es necesario)
        System.out.println(LastResponse.received().answeredBy(actor).asString());
    }
}