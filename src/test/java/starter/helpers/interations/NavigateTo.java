package starter.helpers.interations;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import starter.helpers.pages.BuscarProductoPage;

public class NavigateTo {
    public static Performable loginPage(){
        return Task.where("abre la página de inicio de sesión",
                Open.browserOn().the(BuscarProductoPage.class));
    }
}
