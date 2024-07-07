/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica4.pkg1;
import java.util.*;
/**
 *
 * @author alumnos
 */
public class Practica41 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           int v[] = new int[10];
        int total=0;
        int cont=0;
     System.out.println("INGRESE LOS VALORES");
     for(int i=0;i<v.length;i++) {
     Scanner scanner = new Scanner(System.in);
     System.out.print("Ingrese nota "+(i+1)+" : ");
     v[i] = scanner.nextInt();
     total+=v[i];
     }
      float prom=(float)total/v.length;
      for(int i=0;i<v.length;i++) {
      if (v[i]<prom){
         cont++;
       } 
    }
    System.out.println("Total: "+total);
    System.out.println("Promedio: "+prom);
    System.out.println("Numeros menores al promedio: "+cont);
    }
    
}
