package co.com.choucair.certification.prueba.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.thucydides.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class ChoucairLoginPage extends PageObject {

    public static final Target LOGIN_BUTTON = Target.the("boton que nos muestra el formulario para iniciar sesion")
                                            .located(By.buttonText("Ingresar"));
    public static final Target INPUT_USER =  Target.the("donde escribimos el usuario")
                                            .located(By.id("username"));
    public static final Target INPUT_PASSWORD =  Target.the("donde escribimos la contraseña")
                                            .located(By.id("password"));

    public static final Target ENTER_BUTTON =  Target.the("boton confirmar login")
            .located(By.xpath("//button[contains(@class, 'btn btn-primary')]"));
}
