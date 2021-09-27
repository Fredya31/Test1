package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage extends PageObject {
    public  static final Target BUTTON_UC = Target.the("Seleccionar la univarsidad Choucair").
            located( By.xpath("//div[@ID='universidad']//strong"));
    public static final Target INPUT_COURSE = Target.the("Buscar").
            located (By.id("coursesearchbox"));
    public static final Target BUTTON_GO = Target.the("Elegir el curso que necesita").
            located(By.id("//button[@class='btn btn-secondary]"));
    public static final Target SELECT_COURSE = Target.the("Elegir curso").
            located (By.xpath("//h4[contains(text(),'Recursos Automatización Bancolombia')]"));
    public static final Target NAME_COURSE = Target.the("Extraer el nombre del curso que necesita").
            located(By.xpath("//h1[contains(),'Recursos Automaticos Bancolombia')]"));
}
