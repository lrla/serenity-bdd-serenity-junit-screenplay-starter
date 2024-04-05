package starter.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import starter.helpers.pages.BuscarProductoPage;

public class ProductoDevuelto implements Question<Boolean> {

    private String productoDevuelto;

    public ProductoDevuelto(String productoDevuelto){
        this.productoDevuelto = productoDevuelto;
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        return productoDevuelto.equals(BuscarProductoPage.PRODUCTO_DEVUELTO_CARRITO.resolveFor(actor).getText());
    }

    public static ProductoDevuelto isConsistent(String productoDevuelto){
        return new ProductoDevuelto(productoDevuelto);
    }
}