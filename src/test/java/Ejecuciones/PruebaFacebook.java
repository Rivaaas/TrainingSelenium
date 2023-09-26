package Ejecuciones;

import Entidades.Facebook.Ent_LoginFacebook;
import Escenarios.Tiquetes.Esc_PaginaInicioFacebook;
import Recursos.Navegador.Pag_Navegador;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class PruebaFacebook {

    WebDriver driver;
    Ent_LoginFacebook entloginf;

    @Before
    public void PreEjecucion(){
        Pag_Navegador pag_navegador = new Pag_Navegador(driver);
        driver= pag_navegador.AbrirNavegador("https://www.facebook.com/");
    }

    @After
    public void PostEjecucion(){
        //driver.close();
    }


    //public void LecturaDatos {
         //entloginf = new Ent_LoginFacebook();
        // entloginf.
  //  }
    @Test
    public void RealizarConsultaTicketes(){
        Esc_PaginaInicioFacebook esc_paginainicio = new Esc_PaginaInicioFacebook(driver);
        esc_paginainicio.ConsultarRegistro(driver);

    }





}