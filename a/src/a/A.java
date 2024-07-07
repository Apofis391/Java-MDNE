/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a;
import java.util.*;
/**
 *
 * @author alumnos
 */
public class A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> lista=new ArrayList<>();
        int t=lista.size();
        System.out.println("El tamaño de la ArrayList es: "+t);
        lista.add("Elemento 1");
        lista.add("Elemento 2");
        lista.add("Elemento 3");
        lista.add("Elemento 4");
        lista.add("Elemento 5");
        lista.add("Elemento 6");
        lista.add("Elemento 7");
        lista.add("Elemento 8");
        lista.add("Elemento 9");
        lista.add("Elemento 10");
        lista.add("Elemento 11");
        lista.add("Elemento 12");
        for(Object o:lista){
            System.out.println(o);
        }
        t=lista.size();
        System.out.println("El tamaño de la ArrayList es: "+t);
    }
    
}
