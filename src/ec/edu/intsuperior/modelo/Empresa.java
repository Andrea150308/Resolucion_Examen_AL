package ec.edu.intsuperior.modelo;

/**
 *
 * @author Andrea López
 */
public class Empresa {
   private String rup;
   private String nombre;
   private String direccion;
   private String telefonoContacto;
   private String correo;

    public Empresa() {
      
    }

    public Empresa(String rup, String nombre, String direccion, String telefonoContacto, String correo) {
        this.rup = rup;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefonoContacto = telefonoContacto;
        this.correo = correo;
    }
    

    public String getRup() {
        return rup;
    }

    public void setRup(String rup) {
        this.rup = rup;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefonoContacto() {
        return telefonoContacto;
    }

    public void setTelefonoContacto(String telefonoContacto) {
        this.telefonoContacto = telefonoContacto;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return  "Rup: "+getRup()+"\n"
                + "Nombre: "+getNombre()+"\n"
                + "Direccion: "+getDireccion()+"\n"
                + "Telefono de contacto; "+getTelefonoContacto()+"\n"
                + "Correo: "+getCorreo();
    }
    
    
   
   
   
   
    
    
}
    