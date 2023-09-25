package Escenarios.Tiquetes;

import Recursos.Utilidades.Rec_Global;
import org.openqa.selenium.WebDriver;

public class Esc_PaginaInicioFacebook {
    WebDriver driver;

    public Esc_PaginaInicioFacebook(WebDriver _driver){
        driver = _driver;
    }
    public void ConsultarRegistro(WebDriver driver){
        Rec_Global rec_global = new Rec_Global(driver);
        String correo ="//*[@name='email']";
        String pass="//*[@type='password']";
        rec_global.Escribir("rivaaas.v@gmail.com",correo);
        rec_global.Escribir("Ordiexl0402",pass);
    }
}
