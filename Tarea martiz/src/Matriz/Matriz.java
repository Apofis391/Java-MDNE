/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Matriz;
import java.util.*;
/**
 *
 * @author alumnos
 */
public class Matriz {

    /**
     * @param args the command line arguments
     */
    private Scanner teclado;
    private int[][] mat;
    int filas,columnas,fila,columna;
    public void cargar() {
        teclado=new Scanner(System.in);
        System.out.print("Cuantas fila tiene la matriz:");
        filas=teclado.nextInt();
        System.out.print("Cuantas columnas tiene la matriz:");
        columnas=teclado.nextInt();
        mat=new int[filas][columnas];
        for(int f=0;f<mat.length;f++) {
            for(int c=0;c<mat[f].length;c++) {
                System.out.print("Ingrese componente:");
                mat[f][c]=teclado.nextInt();
            }
        }
        for(int f=0;f<mat.length;f++) {
            for(int c=0;c<mat[f].length;c++) {
                int arreglo[]={mat[f][c]};
                System.out.println("Efectos de pasar una referencia a una vector completo:\n"+"Los valores del vector original son:");
                for(int valor:arreglo){
                     System.out.println(valor);
                }

                    modificarArreglo(arreglo);
                    System.out.println(" Los valores del vector modificados son");
                    for(int valor:arreglo){
                        System.out.println(valor);
                    }
                    ordenar(arreglo);
                    System.out.println(" Los valores del vector ordenados son");
                     for(int valor:arreglo){
                        System.out.println(valor);
                    }
            }
        }
        teclado=new Scanner(System.in);
        System.out.print("Cuantas fila tiene la matriz:");
        fila=teclado.nextInt();
        System.out.print("Cuantas columnas tiene la matriz:");
        columna=teclado.nextInt();
        mat=new int[fila][columna];
        for(int a=0;a<mat.length;a++) {
            for(int b=0;b<mat[a].length;b++) {
                System.out.print("Ingrese componente:");
                mat[a][b]=teclado.nextInt();
            }
        }
        for(int a=0;a<mat.length;a++) {
            for(int b=0;b<mat[a].length;b++) {
                int arreglo[]={mat[a][b]};
                System.out.println("Efectos de pasar una referencia a una vector completo:\n"+"Los valores del vector original son:");
                for(int valor:arreglo){
                     System.out.println(valor);
                }

                    modificarArreglo(arreglo);
                    System.out.println(" Los valores del vector modificados son");
                    for(int valor:arreglo){
                        System.out.println(valor);
                    }
                    ordenar(arreglo);
                    System.out.println(" Los valores del vector ordenados son");
                     for(int valor:arreglo){
                        System.out.println(valor);
                    }
            }
        }
         
    }
    
    public void imprimir() {
        for(int f=0;f<mat.length;f++) {
            for(int c=0;c<mat[f].length;c++) {
                System.out.print(mat[f][c]+" ");
            }
            System.out.println();
        }
    }
    
    public void imprimirUltimaFila() {
    	System.out.println("Ultima fila");
        for(int c=0;c<mat[mat.length-1].length;c++) {
             System.out.print(mat[mat.length-1][c]+" ");
        }
    }
    
    public static void main(String[] ar) {
        Matriz ma=new Matriz();
        ma.cargar();
        ma.imprimir();
        ma.imprimirUltimaFila();
    }   
  public static void  ordenar (int arreglo[]){
      for(int i=0;i<arreglo.length-1;i++){
         for(int j=i+1;j<arreglo.length;j++){
          if(arreglo[i]>=arreglo[j])
          {
              int c=arreglo[i];
              arreglo[i]=arreglo[j];
              arreglo[j]=c;
          }
       }
     }
  }
    public static void modificarArreglo(int arreglo2[]){
        for(int contador=0;contador< arreglo2.length;contador++){
            arreglo2[contador]*=2;
        }
        
    }
    public static void maind(String[] args) {
        // TODO code application logic here
        
        
    }
    
}
