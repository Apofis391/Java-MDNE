/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jose;
import java.util.*;
/**
 *
 * @author alumnos
 */
public class Jose {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Hashtable tabla  = new Hashtable();
	tabla.put("101","harry");
	tabla.put("102", "batman");
	tabla.put("103","panda");
	tabla.put("104","ironman");
	tabla.put("105","supermen");
        String clave;
        clave="101";
        System.out.println("La palabra "+clave+" es: "+ tabla.get(clave));
        clave="102";
        System.out.println("La palabra "+clave+" es: "+ tabla.get(clave));
        clave="103";
        System.out.println("La palabra "+clave+" es: "+ tabla.get(clave));
        clave="104";
        System.out.println("La palabra "+clave+" es: "+ tabla.get(clave));
        clave="105";
        System.out.println("La palabra "+clave+" es: "+ tabla.get(clave));
    }
    
}
