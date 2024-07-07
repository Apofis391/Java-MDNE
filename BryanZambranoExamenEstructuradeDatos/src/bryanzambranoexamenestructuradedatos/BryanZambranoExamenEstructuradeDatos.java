/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bryanzambranoexamenestructuradedatos;
import java.util.*;
/**
 *
 * @author Bryan Zambrano
 */
public class BryanZambranoExamenEstructuradeDatos {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          //Elabore un programa Java que usando arreglos genere veinte y cinco mil 
          //(25000) números aleatorios entre -1000 y 1000, los almacene en el arreglo
          //y luego los ordene comparando 2 métodos de ordenamiento según la tabla adjunta.
          int min = -1001;
          int max = 1001;
          int numero;
          Scanner Ingresar=new Scanner(System.in);
          System.out.println("Ingresar");
          numero=Ingresar.nextInt();
          int A[]=new int[numero];
          for(var i=0;i<numero;i++){
            A[i]=(int)Math.floor(Math.random()*(max-min+1)+min);
            System.out.println(+i+"="+A[i]);
          }
         HeapSort ao = new  HeapSort();
         System.out.println("Algoritmos de Ordenamiento");
         System.out.println("El vector original");
          ao.mostrar(A);
          System.out.println("Metodo Quick");
          ao.AlgoritmoQuick(A);
          ao.mostrar(A); 
          
          HeapSort hs = new HeapSort();
           System.out.println("HeapSort");
           hs.sort(A);
           hs.mostrar(A);
          
  
      
    }    
    
    }
