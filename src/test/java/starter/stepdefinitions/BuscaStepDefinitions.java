package starter.stepdefinitions;

import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;
import starter.helpers.pages.BuscarProductoPage;
import starter.questions.ElementVisible;
import starter.questions.ProductoDevuelto;
import starter.tasks.BuscarProducto;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;
import static starter.helpers.pages.BuscarProductoPage.BTN_SEARCH;
import static starter.helpers.pages.BuscarProductoPage.INPUT_PRODUCTO;
import static starter.utils.constants.Values.PRODUCTO_DEVUELTO;

public class BuscaStepDefinitions {
    @Y("^que el actor investiga un producto (.*)$")
    public void completar_credenciales(String producto) {
        theActorInTheSpotlight().attemptsTo(
                BuscarProducto.rellenar_campo(producto)
        );
    }

    @Y("que el actor clic en el producto devuelto")
    public void check_producto_devuelto() {
                theActorInTheSpotlight().attemptsTo(
                        WaitUntil.the(BuscarProductoPage.PRODUCTO_DEVUELTO, WebElementStateMatchers.isVisible()).forNoMoreThan(45).seconds(),
                        Scroll.to(BuscarProductoPage.PRODUCTO_DEVUELTO),
                        Click.on(BuscarProductoPage.PRODUCTO_DEVUELTO),
                        WaitUntil.the(BuscarProductoPage.RADIO_BTN_TAMANO, WebElementStateMatchers.isVisible()).forNoMoreThan(30).seconds(),
                        Click.on(BuscarProductoPage.RADIO_BTN_TAMANO),
                        WaitUntil.the(BuscarProductoPage.BTN_CLOSE_FLOATER, WebElementStateMatchers.isVisible()).forNoMoreThan(60).seconds(),
                        Scroll.to(BuscarProductoPage.BTN_CLOSE_FLOATER),
                        Click.on(BuscarProductoPage.BTN_CLOSE_FLOATER),
                        WaitUntil.the(BuscarProductoPage.BTN_AGREGAR_CARRITO, WebElementStateMatchers.isVisible()).forNoMoreThan(60).seconds(),
                        Scroll.to(BuscarProductoPage.BTN_AGREGAR_CARRITO),
                        Scroll.to(BuscarProductoPage.RADIO_BTN_TAMANO),
                        Click.on(BuscarProductoPage.BTN_AGREGAR_CARRITO)

  );
    }

    @Entonces("que el actor compruebo el carrito de compras")
    public void el_actor_compruebo_que_el_producto_esta_en_el_carrito_de_compras() {

        theActorInTheSpotlight().attemptsTo(
                Click.on(BuscarProductoPage.ICONE_CARRITO),
                WaitUntil.the(BuscarProductoPage.PRODUCTO_DEVUELTO_CARRITO, WebElementStateMatchers.isVisible()).forNoMoreThan(60).seconds()

        );
        theActorInTheSpotlight().should(
                seeThat("Validar producto de la busca", Text.of(BuscarProductoPage.PRODUCTO_DEVUELTO_CARRITO),
                        equalTo(PRODUCTO_DEVUELTO))

        );
    }

}
