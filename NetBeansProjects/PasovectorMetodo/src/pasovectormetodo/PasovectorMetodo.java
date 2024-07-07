/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pasovectormetodo;

/**
 *
 * @author alumnos
 */
public class PasovectorMetodo {

    /**
     * @param args the command line arguments
     */
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
    public static void main(String[] args) {
        // TODO code application logic here
        
        int arreglo[]={3,2,7,4,10,6 };
        System.out.println("Efectos de pasar una referencia a una vector completo:\n"+"Los valores del vector original son:");
        for(int valor:arreglo){
             System.out.println(valor);
        }
           
            modificarArreglo(arreglo);
            System.out.println("\n\n Los valores del vector modificados son");
            for(int valor:arreglo){
                System.out.println(valor);
            }
            ordenar(arreglo);
            System.out.println("\n\n Los valores del vector ordenados son");
             for(int valor:arreglo){
                System.out.println(valor);
            }
         
    }
    
}
