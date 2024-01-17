package co.com.sofka;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

public class SetupApis {

    protected static final String baseUrlApiSoap = "https://www.crcind.com";
    protected static final String baseUrlApiRest = "https://f5a60502-9e94-4cd8-8073-b653543d29b5.mock.pstmn.io";
    protected Actor actor = new Actor ("Jhorman");

    protected void actorCallAnAPiRest(){
        actor.can(CallAnApi.at(baseUrlApiRest));
        actor.remember("baseUrl", baseUrlApiRest);
    }

    protected void actorCallAnAPiSoap(){
        actor.can(CallAnApi.at(baseUrlApiSoap));
        actor.remember("baseUrl", baseUrlApiSoap);
    }

}
