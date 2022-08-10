package ec.edu.intsuperior.modelo;

import java.util.Date;

/**
 *
 * @author Andrea López
 */
public class Cliente extends Persona {
     private String TelefonoContacto;

    public Cliente() {
    }

    public Cliente(String TelefonoContacto, String cedula, String nombre, String apellido, String direccion, String correo, Date fechaNacimiento) {
        super(cedula, nombre, apellido, direccion, correo, fechaNacimiento);
        this.TelefonoContacto = TelefonoContacto;
    }
    
    public String getTelefonoContacto() {
        return TelefonoContacto;
    }

    public void setTelefonoContacto(String TelefonoContacto) {
        this.TelefonoContacto = TelefonoContacto;
    }
    
   
    @Override
    public String toString() {
        return super.toString() + "\n"
                + "Telefono de contacto: " + getTelefonoContacto();
    }    
    
    
}
