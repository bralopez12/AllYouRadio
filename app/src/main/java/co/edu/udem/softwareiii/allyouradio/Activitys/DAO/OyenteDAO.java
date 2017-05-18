package co.edu.udem.softwareiii.allyouradio.Activitys.DAO;

import co.edu.udem.softwareiii.allyouradio.Activitys.Conexion;
import co.edu.udem.softwareiii.allyouradio.Activitys.DTO.OyenteDTO;

/**
 * Created by El Brayan on 18/05/2017.
 */

public class OyenteDAO {

    Conexion cn;

    public OyenteDAO(Conexion cn) {
        this.cn = cn;
    }

    public OyenteDTO obtenerOyente(String correo){


        if(correo.isEmpty()){
            return null;
        }else if(!correo.contains("@")){
            return null;
        }
        OyenteDTO oyenteDTO = new OyenteDTO("","","","");


        return oyenteDTO;
    }


    public boolean insertarOyente(OyenteDTO oyente){

        if(oyente == null){
            return false;
        }else if(!oyente.getCorreo().contains("@")){
            return  false;
        }else if(oyente.getContraseña().contains(" ")){
            return false;
        }




        return true;
    }



    public boolean ingresarTelefonoOyente(OyenteDTO oyente){

        try{
            Integer.parseInt(oyente.getTelefono());
        }catch (NumberFormatException nex){
            return false;
        }

        return true;
    }

    public boolean modificarContraseña(OyenteDTO oyente){

        if(oyente == null){
            return false;
        }else if(oyente.getContraseña().contains(" ")){
            return false;
        }

        return true;
    }


}
