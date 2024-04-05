package starter.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import starter.model.UsuarioModel;

import static starter.helpers.pages.BuscarProductoPage.BTN_SEARCH;
import static starter.helpers.pages.BuscarProductoPage.INPUT_PRODUCTO;

public class BuscarProducto implements Task {

    private String producto;

    public BuscarProducto(String producto) {
        this.producto = producto;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(INPUT_PRODUCTO, WebElementStateMatchers.isClickable()).forNoMoreThan(1).seconds(),
                Enter.theValue(this.producto).into(INPUT_PRODUCTO),
                Click.on(BTN_SEARCH)
        );

    }

    public static BuscarProducto rellenar_campo(String producto){
        return Tasks.instrumented(BuscarProducto.class, producto);
    }
}
