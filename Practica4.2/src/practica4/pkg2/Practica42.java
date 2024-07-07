/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica4.pkg2;
import java.util.*;
/**
 *
 * @author alumnos
 */
public class Practica42 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int total=0;
        float pro;
        int cont=0;
      ArrayList<Integer> valor = new ArrayList<Integer>();
      Scanner ingreso=new Scanner(System.in);
      for(int i=1;i<=10;i++){
      System.out.print("Ingrese el valor "+i+": ");
      int dato=ingreso.nextInt();
        valor.add(dato);
     } for(int i=0;i<valor.size();i++){
     total+=valor.get(i);
     }
     pro=(float)total/valor.size();
     for(int i=0;i<valor.size();i++){
     if (valor.get(i)<pro)
        cont++;
     }
     
     System.out.println("Total: "+total);
     System.out.println("Promedio: "+pro);
    }
    
}
