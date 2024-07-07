/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arbolesbinariosbusqueda;
import java.util.*;
/**
 *
 * @author Ciro
 */
public class ArbolesBinariosBusqueda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        metodosArboles ma=new metodosArboles();
        Random rand=new Random();
        int cantidad= rand.nextInt(10000);
        for(int i=1;i<=cantidad; i++){
            int number=(int)Math.floor(Math.random()*(122-97)+97);
            String letra="";
            letra+=(char)number;
            ma.insertar(letra);
        }      
        System.out.println("Recorrido Preorden");
        ma.imprimePre();
         System.out.println("Recorrido Inorden");
        ma.imprimeIn();
         System.out.println("Recorrido Postorden");
        ma.imprimePos();
        System.out.println("La cantidad de nodos del arbol es: "+ma.cantidadNodos());
        System.out.println("La altura del arbol es: "+ma.retornaAltura());
        System.out.println("La cantidad de hojas del arbol es: "+ma.cantidadHojas());
        ma.nodoMayor();
        ma.nodoMenor();
        ma.borrarMenor();
        ma.imprimeIn();
    }
    
}
