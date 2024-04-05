package starter.stepdefinitions;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import starter.tasks.Login;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginStepDefinitions {
    @Y("^que el actor realiza el login llenando el campo (.*) y (.*)$")
    public void realizar_login(String username, String password) {
        theActorInTheSpotlight().attemptsTo(
                Login.realiza_login(username, password)
        );

    }

}

