/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemploiterador;
import java.util.*;
/**
 *
 * @author alumnos
 */
public class Ejemploiterador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vector v = new Vector();
        for(int i=1;i<=10;i++){
            v.add(new String("Mensaje " + i));
        }
	//elementos del vector recorridos por el iterador 
        System.out.println("Elementos del vector recorridos por Iterator:");
        String mensaje;
        Iterator iterator = v.iterator();
        while(iterator.hasNext()){
            mensaje=(String)iterator.next();
            System.out.println(mensaje);
            iterator.remove();
            System.out.println("Elementos después de remover Iterator:");
            iterator = v.iterator();
        }
        while(iterator.hasNext()){
            mensaje=(String)iterator.next();
            System.out.println(mensaje);
            

        }
    
    }
}

