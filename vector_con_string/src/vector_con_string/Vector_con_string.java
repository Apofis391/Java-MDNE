/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vector_con_string;
import java.util.*;
/**
 *
 * @author alumnos
 */
public class Vector_con_string {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vector<String> v=new Vector<String>();
        v.add("Pablo");
        v.add("ash");
        v.add("victor");
        int a=v.capacity();
        System.out.println("La capaciada es "+a);
        System.out.println("Datos del vector original");
        for(String s : v){
            System.out.println(s);
        }
        /*for(int i=0;  i<v.size();i++){
            System.out.println(v.get(i));
        }*/
        v.remove(0);
        System.out.println("Datos mofdificados");
        v.add(1,"olivar");
        v.addElement("genesis");
        for(String s:v){
            System.out.println(s);
        }
        /*String sr=v.get(3);
        sr=sr.toLowerCase();*/
        if(v.contains("genesis")){
            System.out.println("Si encontro el elemento");
        }else
            System.out.println("No encontro el elemento");
        System.out.println("El primer elemento es: "+v.firstElement());
        System.out.println("El ultimo elemento es: "+v.lastElement());
    }
    
}
