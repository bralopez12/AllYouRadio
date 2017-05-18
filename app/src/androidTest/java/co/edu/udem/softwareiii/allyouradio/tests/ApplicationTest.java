package co.edu.udem.softwareiii.allyouradio.tests;

import android.app.Application;
import android.test.ApplicationTestCase;

import co.edu.udem.softwareiii.allyouradio.Activitys.RegisterListener_Activity;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest extends ApplicationTestCase<Application> {
    public ApplicationTest() {
        super(Application.class);
    }

    public void validacion_Registro_Oyente_test(){

        RegisterListener_Activity ra = new RegisterListener_Activity();

        assertTrue(ra.validarDatosOyente("bralopez12","brayan lopez foronda","queleimporta")); //
        assertTrue(ra.validarDatosOyente("bralopez12@hotmail.com", "andres felipe granda", "teamoyurani"));
        assertFalse(ra.validarDatosOyente("bralopez12@hotmail.com","andres felipe granda 123123","teamoyurani"));
        assertFalse(ra.validarDatosOyente("bralopez12@hotmail.com","andres felipe granda 123123","Esto es para una nota de 5"));

    }

    public void eliminar_Oyente_test(){
        RegisterListener_Activity ra = new RegisterListener_Activity();

        assertTrue(ra.eliminarOyente("bralopez12", "queleimporta"));
        assertTrue(ra.eliminarOyente("bralopez12@hotmail.com", "teamoyurani"));
        assertFalse(ra.eliminarOyente("bralopez12@hotmail.com","teamoyurani"));
        assertFalse(ra.eliminarOyente("bralopez12@hotmail.com","Esto es para una nota de 5"));
    }


    public void cambio_Contraseña_Oyente_test(){
        RegisterListener_Activity ra = new RegisterListener_Activity();

        assertTrue(ra.modificarContraseña("bralopez12", "queleimporta", "lavidaesunjuego"));
        assertTrue(ra.modificarContraseña("bralopez12@hotmail.com", "teamoyurani", "soyelmejor"));
        assertFalse(ra.modificarContraseña("bralopez12@hotmail.com","teamoyurani", "odioatodoelmundo"));
        assertFalse(ra.modificarContraseña("bralopez12@hotmail.com","Esto es para una nota de 5", "no jodan mas"));
    }



}