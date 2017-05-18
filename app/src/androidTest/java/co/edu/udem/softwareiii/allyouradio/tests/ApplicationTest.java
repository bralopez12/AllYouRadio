package co.edu.udem.softwareiii.allyouradio.tests;

import android.app.Application;
import android.test.ApplicationTestCase;


import co.edu.udem.softwareiii.allyouradio.Activitys.Conexion;
import co.edu.udem.softwareiii.allyouradio.Activitys.DAO.OyenteDAO;
import co.edu.udem.softwareiii.allyouradio.Activitys.DTO.OyenteDTO;

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

    public void test_insertar_Oyente(){


        assertTrue(oyentedao.insertarOyente(oyenteDTO1));
        assertTrue(oyentedao.insertarOyente(oyenteDTO2));


    }

    public void test_insertar_Oyente2(){

        Conexion cn = new Conexion();
        OyenteDAO oyentedao = new OyenteDAO(cn);

        assertTrue(oyentedao.insertarOyente(oyenteDTO3));
        assertTrue(oyentedao.insertarOyente(oyenteDTO4));

    }

    public void testModificarPassword_Oyente(){


        assertTrue(oyentedao.modificarContraseña(oyenteDTO1));

    }

    public void testModificarPassword_Oyente2(){


        assertTrue(oyentedao.modificarContraseña(oyenteDTO4));

    }


    public void test_Ingresar_Telefono_Oyente(){


        assertTrue(oyentedao.ingresarTelefonoOyente(oyenteDTO2));

    }

    public void test_Ingresar_Telefono_Oyente2(){


        assertTrue(oyentedao.ingresarTelefonoOyente(oyenteDTO4));

    }


}