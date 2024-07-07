/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polimorfismo.y.herencia;
import java.util.*;
/**
 *
 * @author 123
 */
public class PolimorfismoYHerencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Persona> personas = new ArrayList();

        Persona maestro = new Maestro("Juan", "Perez", 30, "JPMN");
        Persona alumno = new Alumno("Gerardo", "Martinez", 18, 123123);

        personas.add(maestro);
        personas.add(alumno);

        for(Persona persona:personas){
            System.out.println(persona.obtenerInformacion());
        }   
    }
    
}
