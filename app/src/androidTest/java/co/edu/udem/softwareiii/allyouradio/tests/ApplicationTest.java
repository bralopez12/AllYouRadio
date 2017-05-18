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

    public void test_validacion_Registro_Oyente(){

        RegisterListener_Activity ra = new RegisterListener_Activity();

        assertTrue(ra.ValidarDatosOyente("bralopez12","brayan lopez foronda","queleimporta"));
        assertTrue(ra.ValidarDatosOyente("bralopez12@hotmail.com", "andres felipe granda", "teamoyurani"));
        assertFalse(ra.ValidarDatosOyente("bralopez12@hotmail.com","andres felipe granda 123123","teamoyurani"));
        assertFalse(ra.ValidarDatosOyente("bralopez12@hotmail.com","andres felipe granda 123123","Esto es para una nota de 5"));


    }

}