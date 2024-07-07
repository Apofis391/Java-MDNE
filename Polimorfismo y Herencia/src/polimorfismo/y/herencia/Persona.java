/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismo.y.herencia;

/**
 *
 * @author 123
 */
public class Persona {
    private String nombre;
    private String apellidos;
    private int edad;

    public Persona(String nombre, String apellidos,int edad){
        setNombre(nombre);
        setApellidos(apellidos);
        setEdad(edad);
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public void setApellidos(String apellidos){
        this.apellidos=apellidos;
    }

    public String getApellidos(){
        return apellidos;
    }

    public void setEdad(int edad){
        this.edad=edad;
    }

    public int getEdad(){
        return edad;
    }

    public String obtenerInformacion(){
        String bot= nombre + apellidos;
        return bot;
    }   
}
