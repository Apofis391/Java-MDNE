/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismo.y.herencia;

/**
 *
 * @author 123
 */
public class Maestro extends Persona{

    private String claveEmpleado;

    public Maestro(String nombre,String apellidos,int edad,String claveEmpleado){
        super(nombre,apellidos,edad);
        this.claveEmpleado=claveEmpleado;
    }

    public void setClaveEmpleado(String claveEmpleado){
        this.claveEmpleado=claveEmpleado;
    }

    public String getClaveEmpleado(){
        return claveEmpleado;
    }
    @Override    
public String obtenerInformacion() {
   return this.getNombre() + " " + this.getApellidos() + " " + this.getEdad() + " " + this.getClaveEmpleado();
}
}

