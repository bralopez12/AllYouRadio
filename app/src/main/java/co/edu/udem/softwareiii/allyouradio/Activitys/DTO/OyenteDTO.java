package co.edu.udem.softwareiii.allyouradio.Activitys.DTO;

/**
 * Created by El Brayan on 18/05/2017.
 */

public class OyenteDTO {

    String correo;
    String nombre;
    String contraseña;
    String telefono;

    public OyenteDTO(String correo, String nombre, String contraseña, String telefono) {
        this.correo = correo;
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.telefono = telefono;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getContraseña() {
        return contraseña;
    }
}
