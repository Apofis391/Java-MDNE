/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;
import java.util.*;
/**
 *
 * @author alumnos
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Hashtable tabla = new Hashtable(); 
        tabla.put("Hola", "hello");
        tabla.put("mundo", "world");
        String clave; 
        clave="hola"; 
        System.out.println("La palabra "+clave+" en inglés es:"+ tabla.get(clave)); 
        clave="mundo"; 
        System.out.println("La palabra "+clave+" en inglés es: "+ tabla.get(clave)); 




    }
    
}
