package starter.stepdefinitions;
import io.cucumber.java.es.Dado;

import starter.model.ListOfUsersEntry;
import starter.model.ListOfUsersEntryModel;
import starter.tasks.RegistroUsuario;
import starter.utils.datajson.EnvironmentVariablesUtil;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class RegistroStepDefinitions  {
    @Dado("^que el actor hace clic en el botón para nuevo registro$")
    public void registro_usuario(){
        ListOfUsersEntry lista = EnvironmentVariablesUtil.getListOfUsersEntry();

        for (ListOfUsersEntryModel users: lista.){
            theActorInTheSpotlight().attemptsTo(
                    RegistroUsuario.registro_usuario(users)
            );
        }
    }

}
