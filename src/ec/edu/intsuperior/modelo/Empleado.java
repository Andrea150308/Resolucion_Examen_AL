
package ec.edu.intsuperior.modelo;

import java.util.Date;

/**
 *
 * @author Andrea López
 */
public class Empleado extends Persona{
    private double sueldo;

    public Empleado() {
    }

    public Empleado(double sueldo, String cedula, String nombre, String apellido, String direccion, String correo, Date fechaNacimiento) {
        super(cedula, nombre, apellido, direccion, correo, fechaNacimiento);
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
}

   