package co.com.choucair.certification.prueba.userinterface;

import net.thucydides.core.pages.PageObject;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage extends PageObject {

    public static final Target BUTTON_UC = Target.the("Selecciona certificaciones")
            .located(By.xpath("//div[@id='certificaciones']//strong"));
    public static final Target INPUT_COURSE = Target.the("Buscar el curso")
            .located(By.id("coursesearchbox"));
    public static final Target BUTTON_GO  = Target.the("Click para buscar el curso")
            .located(By.xpath("//button[contains(text(),'Ir')]"));
    public static final Target SELECT_COURSE = Target.the("busca entre los resultados")
            .located(By.xpath("//a[contains(text(),'Certified Data & Analytics Tester (CDAT)')]"));
    public static final Target NAME_COURSE = Target.the("Extrae el nombre del curso")
            .located(By.xpath("//h1[contains(text(),'Certified Data & Analytics Tester (CDAT)')]"));
}
