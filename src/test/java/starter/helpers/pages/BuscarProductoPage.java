package starter.helpers.pages;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://www.dafiti.com.br/")
public class BuscarProductoPage extends PageObject {

    public static final Target INPUT_PRODUCTO =Target.the("Input buscar producto").locatedBy("//*[@id=\"input-search\"]");

    public static final Target BTN_ENTRAR =Target.the("Input buscar producto").locatedBy("//*[@id=\"wrapper\"]/div[1]/div[2]/div/div/div[3]/div[1]/div[1]/a[1]");

    public static final Target PRODUCTO_DEVUELTO =Target.the("Producto devuelto en la busca").locatedBy("//*[@id=\"wrapper\"]/div[4]/div[3]/div[3]/div/div[2]/div[2]");

    public static final Target BTN_SEARCH =Target.the("Lupa pesquisa buton").locatedBy("//button[@class='search-button icon-magnifier-2']");
    public static final Target BTN_AGREGAR_CARRITO =Target.the("Buton agregar producto en carrito de compras").locatedBy("#add-to-cart > button");

    public static final Target RADIO_BTN_TAMANO =Target.the("Buton tamaño calca").locatedBy("//*[@id=\"selection-box-radio-button\"]/ul/li[2]/label");
    public static final Target BTN_CLOSE_FLOATER =Target.the("Buton Floater").locatedBy("//*[@id=\"AllPages_Floater\"]/div");

    public static final Target ICONE_CARRITO =Target.the("Buton Floater").locatedBy("//*[@id=\"wrapper\"]/div[1]/div[2]/div/div/div[3]/div[4]/a");

    public static final Target PRODUCTO_DEVUELTO_CARRITO =Target.the("Producto devuelto en la carrito de compras").locatedBy("//*[@id=\"cart_form\"]/article/section/div[3]/div[1]/div[2]/p[1]/a");

}
