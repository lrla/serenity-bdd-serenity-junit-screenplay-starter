package starter.stepdefinitions;
import io.cucumber.java.es.Dado;

import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.actors.OnStage.theActor;


public class CommonStepDefinitions  {
    @Dado("^que el (.*) accede Dafiti$")
    public void acceso(String client){
        // A primeira chamada do ator tem que ser "The actor" e as demais theActorInTheSpotlight
        theActor(client).wasAbleTo(
                Open.browserOn().thePageNamed("pages.dafitiUrl")
        );
    }

}

