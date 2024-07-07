/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package direccionhashtable;
import java.util.*;
/**
 *
 * @author alumnos
 */
public class Direccionhashtable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Hashtable direccion  = new Hashtable();
	direccion.put("calle","Chile");
	direccion.put("numero", "C12-192");
	direccion.put("sector","El centro ");
	direccion.put("ciudad"," Quito ");
	direccion.put("provincia"," Pichincha ");
	direccion.put("pais","Ecuador");
        String miciudad  = (String) direccion.get("ciudad");
        String miprovincia  = (String) direccion.get("provincia");
	String micalle = (String) direccion.get("calle");
	String minumero = (String) direccion.get("numero");
	System.out.println("Direccion : " + micalle + " " + minumero);
	System.out.println("Lugar: " + miciudad + "," + miprovincia);

    }
    
}
