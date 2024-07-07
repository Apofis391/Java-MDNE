/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismo.y.herencia;

/**
 *
 * @author 123
 */
public class Alumno extends Persona{

    private int matricula;

    public Alumno(String nombre,String apellidos, int edad, int matricula){
        super(nombre,apellidos,edad);
        this.matricula=matricula;

    }


    public void setMatricula(int matricula){
        this.matricula=matricula;
    }

     public int getMatricula(){
        return matricula;
    }
     @Override
public String obtenerInformacion() {
   return this.getNombre() + " " + this.getApellidos() + " " + this.getEdad() + " " + this.getMatricula();
}
}