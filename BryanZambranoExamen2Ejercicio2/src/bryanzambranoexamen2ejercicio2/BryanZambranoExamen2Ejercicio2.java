/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bryanzambranoexamen2ejercicio2;
import java.util.*;
/**
 *
 * @author Bryan Zambrano
 */
public class BryanZambranoExamen2Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         metodos Ingresar=new metodos();
        Random r=new Random();
        int cantidad= r.nextInt(100);
        for(int i=1;i<=cantidad; i++){
            int number=(int)Math.floor(Math.random()*(122-97)+97);
            String letra="";
            letra+=(char)number;
            Ingresar.insertar(letra);
        }
        System.out.println("ABB:");
        System.out.println("Recorrido Preorden");
        Ingresar.imprimePre();
         System.out.println("Recorrido Inorden");
        Ingresar.imprimeIn();
         System.out.println("Recorrido Postorden");
        Ingresar.imprimePos();
        System.out.println("");
        System.out.println("La cantidad de nodos del arbol es: "+Ingresar.cantidadNodos());
        System.out.println("La altura del arbol es: "+Ingresar.retornaAltura());
        System.out.println("La cantidad de hojas del arbol es: "+Ingresar.cantidadHojas());
       
    }
    
}
