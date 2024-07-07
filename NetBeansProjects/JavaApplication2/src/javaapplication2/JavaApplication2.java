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
        // TODO code application logic here
        //int arreglo[]={32,27,64,18,95,14,90,70,60,37};
        int n;
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector:");
        n=entrada.nextInt();
        int[] arreglo=new int [n];
         for(var i=0;i<n;i++){
            System.out.println("Ingrese el valor en la posicion:"+(i+1));
            arreglo[i]=entrada.nextInt();
        }
        System.out.println("Indice"+"\t"+"Valor");
        for(int contador=0;contador<arreglo.length;contador++){
            System.out.println(contador+"\t"+arreglo[contador]);
        }
      
    }

    
}
