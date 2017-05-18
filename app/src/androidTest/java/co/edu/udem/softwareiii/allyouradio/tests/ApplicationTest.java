package co.edu.udem.softwareiii.allyouradio.tests;

import android.app.Application;
import android.test.ApplicationTestCase;


import co.edu.udem.softwareiii.allyouradio.Activitys.Conexion;
import co.edu.udem.softwareiii.allyouradio.Activitys.DAO.OyenteDAO;
import co.edu.udem.softwareiii.allyouradio.Activitys.DTO.OyenteDTO;
import co.edu.udem.softwareiii.allyouradio.Activitys.Presentacion.RegisterListener_Activity;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest extends ApplicationTestCase<Application> {

    Conexion cn = new Conexion();
    OyenteDAO oyentedao = new OyenteDAO(cn);

    OyenteDTO oyenteDTO1 = new OyenteDTO("bralopez12@hotmail.com", "andres felipe granda", "teamoyurani","");
    OyenteDTO oyenteDTO2 =  new OyenteDTO("latengodura@hotmail.com", "sebastian moncada", "meamo","2915471");

    OyenteDTO oyenteDTO3 = new OyenteDTO("elbrayanarrobaladronespuntocom", "brayan lopez", "meamo","");
    OyenteDTO oyenteDTO4 = new OyenteDTO("mesaco5conesta@hotmail.com", "brayan lopez", "me amo","abcd");
    public ApplicationTest() {

        super(Application.class);

    }

    public void test_validacion_Registro_Oyente(){


        assertTrue(oyentedao.InsertarOyente(oyenteDTO1));
        assertTrue(oyentedao.InsertarOyente(oyenteDTO2));


    }

    public void test_validacion_Registro_Oyente2(){

        Conexion cn = new Conexion();
        OyenteDAO oyentedao = new OyenteDAO(cn);

        assertTrue(oyentedao.InsertarOyente(oyenteDTO3));
        assertTrue(oyentedao.InsertarOyente(oyenteDTO4));

    }

    public void testModificarPassword_Oyente(){


        assertTrue(oyentedao.modificarContraseña(oyenteDTO1));

    }

    public void testModificarPassword_Oyente2(){


        assertTrue(oyentedao.modificarContraseña(oyenteDTO4));

    }


    public void test_cambio_Contraseña_Oyente(){


        assertTrue(oyentedao.IngresarTelefonoOyente(oyenteDTO2));

    }

    public void test_cambio_Contraseña_Oyente2(){


        assertTrue(oyentedao.IngresarTelefonoOyente(oyenteDTO4));

    }


}