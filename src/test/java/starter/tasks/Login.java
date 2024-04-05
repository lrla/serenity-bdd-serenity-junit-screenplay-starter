package starter.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import starter.model.UsuarioModel;

import static starter.helpers.pages.BuscarProductoPage.BTN_ENTRAR;
import static starter.helpers.pages.LoginPage.*;


public class Login implements Task {

    private String username;
    private String password;

    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_ENTRAR),
                WaitUntil.the(INPUT_USERNAME, WebElementStateMatchers.isClickable()).forNoMoreThan(1).seconds(),
                Click.on(INPUT_USERNAME),
                Clear.field(INPUT_USERNAME),
                Enter.theValue(this.username).into(INPUT_USERNAME),
                Click.on(INPUT_PASSWORD),
                Clear.field(INPUT_PASSWORD),
                Enter.theValue(this.password).into(INPUT_PASSWORD),
                Click.on(BTN_SUBMIT)
                );

    }

    public static Login realiza_login(String username, String password){
        return Tasks.instrumented(Login.class, username, password);
    }
}
