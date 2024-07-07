/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vector;
import java.util.Scanner;


/**
 *
 * @author alumnos
 */
public class metodos_vector {
    private Scanner teclado=new Scanner(System.in);
    private double [] Notas ;//delcarar el vector
    private String[] estudiantes;//declarar el vector tipo string
    //metodo para ingresar datos del vector
    public void Ingresar_datos(){
        Notas=new double[5];//definir tamaño del vector 
        estudiantes=new String[5];//definir tamaño vetor estudiantes
        for(int i=0;i<Notas.length;i++){
            //puede ser 5 pero es mejor Notas.length
            System.out.println("Ingrese el numbre del estudiante :"+(i+1));
            estudiantes[i]=teclado.next();
            System.out.println("Ingrese la nota :"+(i+1));
            Notas[i]=teclado.nextDouble();
        }
        
    }
    
    public void ver_datos(){
        System.out.println("Las notas son:");
        System.out.println("Estudiantes \t Notas");
        System.out.println("");
        for(int i=0;i<Notas.length;i++){
            System.out.print(estudiantes[i]);
            System.out.println("\t"+Notas[i]);
        }
    }
    public void Promedio(){
       double suma=0;
        for(int i=0;i<Notas.length;i++){
            suma=suma+Notas[i];
        }
        System.out.println("El promedio es :"+(suma/Notas.length));
    }
    
    public void Mayor(){
        
       double mayor=Notas[0];
       int pos=0;
        for(int i=0;i<Notas.length;i++){
           if(Notas[i]>mayor){
               mayor=Notas[i];
               pos=i;
           }
        }
        System.out.println("El estudiante con mayor nota es: "+ estudiantes[pos]);
        System.out.println("Su nota es es: "+mayor);
    }
}
