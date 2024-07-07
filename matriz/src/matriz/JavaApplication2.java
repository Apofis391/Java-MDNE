/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matriz;

/**
 *
 * @author alumnos
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    
    public static void imprimir(int arreglo[][]){
       for(int fila=0;fila<arreglo.length;fila++){
            for(int col=0;col<arreglo[fila].length;col++){
                System.out.print(arreglo[fila][col]+"\t");
            }
            System.out.println();
        }
   }
    public static void modificar(int arreglo[][]){
       for(int fila=0;fila<arreglo.length;fila++){
            for(int col=0;col<arreglo[fila].length;col++){
                arreglo[fila][col]*=2;
            }
            System.out.println();
        }
   }
    
    public static void main(String[] args) {
        // TODO code application logic here
        int fila;
        int col;
        //int b[][]=new int[4][3];
        int b[][]={{5,4,6},{8,7,9}};
        int b1[][]={{1,2},{3},{4,5,6}};
      System.out.println("Datos iniciales del arreglo Bidemensional");
        //for(fila=0;fila<b1.length;fila++){
        //    for(col=0;col<b1[fila].length;col++){
        //        System.out.println(b1[fila][col]+"\t");
        //      }
        //  }
     System.out.println("Original B "); 
     imprimir(b);
     System.out.println("Original B1 "); 
     imprimir(b1);
     System.out.println("B -Modificado"); 
     modificar(b);
     imprimir(b);
     System.out.println("B1- Modificado"); 
     modificar(b1);
     imprimir(b1);
     
              
    }
    
}
