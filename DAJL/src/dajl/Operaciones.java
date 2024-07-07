/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dajl;
import java.util.Scanner;
/**
 *
 * @author alumnos
 */
public class Operaciones {
    Scanner scan=new Scanner(System.in);
    public int[] vector;
    
    public int[] enterNumbers(){
        System.out.println("¿Cuantos numeros desea procesar?");
        int n=scan.nextInt();
        int[] vector=new int[n];
        for(int i=0; i<n; i++){
            System.out.println("Ingrese el dato "+(i+1));
            vector[i]=scan.nextInt();
        }
        return this.vector=vector;
    }
    
    public int suma(){
       enterNumbers();
       int acumulador=0;
       System.out.print("Suma: ");
       for(int i=0; i<vector.length; i++){
           acumulador+=vector[i];
           if(i==vector.length-1)
               System.out.print(" "+vector[i]+" =");
           else
               System.out.print(" "+vector[i]+" +");
       }
       return acumulador;
    }
    
    public int potencia(){
        enterNumbers();
        
        if(vector.length<2){
            System.out.println("No se puede realizar la potencia");
            return 0;
        }
        else{
            int acumuladorP=1;
            int acumuladorR=1;
            System.out.print("Potencia: ");
            
            for(int i=1; i<vector.length; i++){
                acumuladorP*=vector[i];
            }   
            for(int i=1; i<=acumuladorP;i++){
                acumuladorR*=vector[0];
            }
            System.out.print(vector[0]+"^"+acumuladorP+" =");
            return acumuladorR;
        }
    }
    
    public double promedio(){
        enterNumbers();
        double acumulador=0;
        for(int i=0; i<vector.length; i++){
            acumulador+=vector[i];
        }
        System.out.print("Promedio:");
        return acumulador/vector.length;
    }
    
    public int factorial(){
        enterNumbers();
        int acumulador=1;
        System.out.println("Potencia:");
        for(int i=vector[0]; i>1;i--){
            acumulador*=i;
            if(i==2)
               System.out.print(" "+i+" * 1 =");
           else
               System.out.print(" "+i+" *");
        }
        return acumulador;
    }
}
