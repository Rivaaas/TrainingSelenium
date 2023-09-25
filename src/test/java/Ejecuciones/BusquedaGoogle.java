package Ejecuciones;

import Escenarios.Mvn.Esc_ConsultarLibrerias;
import Recursos.Navegador.Pag_Navegador;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class BusquedaGoogle {

    WebDriver driver;

    @Before
    public void PreEjecucion(){
        Pag_Navegador pag_navegador = new Pag_Navegador(driver);
         driver= pag_navegador.AbrirNavegador("https://mvnrepository.com/");
    }



    @Test
    public void RealizarConsultaGoogle(){
        Esc_ConsultarLibrerias esc_consultarLibrerias = new Esc_ConsultarLibrerias(driver);
        esc_consultarLibrerias.ConsultarLibreriaMvn(driver);
        try {
            Thread.sleep(6000);
        }catch (Exception fallo){

        }
    }





}
