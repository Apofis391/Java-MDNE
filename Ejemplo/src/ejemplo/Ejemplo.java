/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo;
import java.util.*;
/**
 *
 * @author 123
 */
public class Ejemplo {

    /**
     * @param args the command line arguments
     */
    
  
    public static void main(String[] args) {
        Queue<Persona> cola = new PriorityQueue<Persona>();

        cola.add(new Persona("Daniel", 1));
        cola.add(new Persona("Katherine", 3));
        cola.add(new Persona("Julio", 2));
        cola.add(new Persona("Maria", 1));

        while (!cola.isEmpty()) {
            Persona a = cola.remove();
            System.out.println(a.getNombre() + " " + a.getTipo());
        }
    }

}
