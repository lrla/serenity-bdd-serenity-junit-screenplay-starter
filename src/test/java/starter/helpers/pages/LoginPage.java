package starter.helpers.pages;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class LoginPage extends PageObject {

    public static final Target INPUT_USERNAME =Target.the("Input Email").locatedBy("//*[@id=\"LoginForm_email\"]");

    public static final Target INPUT_PASSWORD =Target.the("Input password").locatedBy("//*[@id=\"LoginForm_password\"]");

    public static final Target BTN_SUBMIT =Target.the("Button submit").locatedBy("//*[@id=\"customer-account-login\"]");

}
