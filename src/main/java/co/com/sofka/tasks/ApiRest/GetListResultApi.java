package co.com.sofka.tasks.ApiRest;

        import io.restassured.http.ContentType;
        import net.serenitybdd.screenplay.Actor;
        import net.serenitybdd.screenplay.Task;

public class GetListResultApi implements Task {

    private String resource;

    public GetListResultApi withTheResource(String resource){
        this.resource=resource;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String token = actor.recall("token");
        actor.attemptsTo(
                net.serenitybdd.screenplay.rest
                        .interactions.Get.resource(resource)
                        .with( requestSpecification -> requestSpecification.header("Authorization", "Bearer " + token)
                                .contentType(ContentType.JSON)
                        )
        );
    }

    public static GetListResultApi getListResult(){
        return new GetListResultApi();
    }
}
