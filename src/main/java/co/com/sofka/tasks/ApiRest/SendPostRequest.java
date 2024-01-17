package co.com.sofka.tasks.ApiRest;

        import io.restassured.http.ContentType;
        import net.serenitybdd.rest.SerenityRest;
        import net.serenitybdd.screenplay.Actor;
        import net.serenitybdd.screenplay.Task;
        import static net.serenitybdd.screenplay.rest.interactions.Post.to;

public class SendPostRequest implements Task {

    private String resource;
    private Object body;

    public SendPostRequest withTheResource(String resource) {
        this.resource = resource;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                to(resource).with(requestSpecification -> requestSpecification.relaxedHTTPSValidation()
                        .baseUri(actor.recall("baseUrl"))
                        .contentType(ContentType.JSON)
                        .body(body))
        );
        String token = SerenityRest.lastResponse().jsonPath().getString("token");
        actor.remember("token", token);
        System.out.println("TOKEN "+ token);
    }

    public static SendPostRequest sendTokenRequest() {
        return new SendPostRequest();
    }

    public SendPostRequest andTheBody(Object body) {
        this.body = body;
        return this;
    }
}
