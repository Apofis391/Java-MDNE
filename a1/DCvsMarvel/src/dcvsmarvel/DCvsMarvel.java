/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dcvsmarvel;
import java.util.*;
/**
 *
 * @author alumnos
 */
public class DCvsMarvel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Hashtable tabla=new Hashtable();
        tabla.put("101", "Harry");
        tabla.put("102", "Batman");
        tabla.put("103", "Panda");
        tabla.put("104", "IronMan");
        tabla.put("105", "SuperMan");
        String clave;
        clave="101";
        System.out.println("El numero "+clave+" es el personaje "+tabla.get(clave));
        clave="102";
        System.out.println("El numero "+clave+" es el personaje "+tabla.get(clave));
        clave="103";
        System.out.println("El numero "+clave+" es el personaje "+tabla.get(clave));
        clave="104";
        System.out.println("El numero "+clave+" es el personaje "+tabla.get(clave));
        clave="105";
        System.out.println("El numero "+clave+" es el personaje "+tabla.get(clave));
        
    }
    
}
