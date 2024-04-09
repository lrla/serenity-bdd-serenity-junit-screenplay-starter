package starter.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import starter.model.ListOfUsersEntry;
import starter.model.ListOfUsersEntryModel;
import starter.model.UsuarioModel;

import static starter.helpers.pages.BuscarProductoPage.BTN_SEARCH;
import static starter.helpers.pages.BuscarProductoPage.INPUT_PRODUCTO;
import static starter.helpers.pages.CadastroPage.BTN_REGISTRO;

public class RegistroUsuario implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BTN_REGISTRO, WebElementStateMatchers.isClickable()).forNoMoreThan(15).seconds(),
                Click.on(BTN_REGISTRO)
        );

    }

    public static RegistroUsuario registro_usuario(ListOfUsersEntryModel users){
        return Tasks.instrumented(RegistroUsuario.class, users);
    }
}
