package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ChoucairLoginPage extends PageObject {
    public static final Target LOGIN_BUTTON = Target.the("Button that shows the input scenario of the form").
            located( By.xpath("//div[@class='d-none d-lg-block']//strong[contains(text(),'Ingresar)]"));

    public static final Target INPUT_USER = Target.the("Space to type the user").
            located (By.id("Username"));

    public static final Target INPUT_PASSWORD = Target.the("Space to type the password").
            located(By.id("Passwaord"));

    public static final Target ENTER_BUTTON = Target.the("Click on the button and confirm entry").
            located (By.xpath("//button[contains(@class,'btn-primary')]"));

}
