package starter.helpers.pages;


import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class CadastroPage extends PageObject {

    public static final Target BTN_REGISTRO =Target.the("Butón nuevo registro de usuário").locatedBy("//*[@id=\"wrapper\"]/div[3]/div[3]/div[4]/ul/li[2]/label");

}
