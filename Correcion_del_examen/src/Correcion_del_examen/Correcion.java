/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Correcion_del_examen;
import java.util.*;
/**
 *⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣤⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⡀⣸⣿⣿⣷⣄⠀⠀⠀⠀⣀⡀⠀⠀⠀⢀⣠⣤⣤⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⣴⣿⣿⣿⣿⡿⣿⣿⣷⣦⣴⣿⣿⣿⣄⣠⠶⣿⡿⢿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣶⣿⡿⠿⢛⣿⣿⣿⣷⣮⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣯⠽⢿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⣿⣿⣿⣿⣿⠟⠉⠀⠀⠀⠀⠈⠛⠻⠿⣽⣿⣿⣿⢻⣿⡹⣶⡾⣿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣿⣿⢟⣾⢏⡤⠴⠶⠆⠀⠀⠀⠀⠀⠤⠤⣄⣻⣿⣿⣾⡏⣷⠽⣿⡋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣾⣿⣧⣾⡟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢹⣿⣿⣿⡇⣿⣷⣿⣿⡁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣾⠿⠛⣿⣿⣿⣠⣤⡴⣦⣝⣦⠀⠀⠀⠀⠖⣋⣡⣤⣸⡇⢻⣿⣿⣿⣿⣼⢻⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠁⠀⠀⣿⣿⣧⠟⢁⣠⣄⡉⠹⠀⠀⠀⠀⠚⠉⢹⡉⠙⠻⣦⣿⣿⣯⣭⡿⢦⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣹⣿⣿⣦⣮⣶⣷⣽⣤⠀⠀⠀⠀⣰⣯⣅⡙⢧⠀⢹⣿⣿⣿⣿⣇⠀⠹⣷⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⣋⣿⡇⠈⢻⣿⣿⠿⠁⠀⠀⠀⠀⠻⣿⣿⣿⣿⠁⠀⣾⣿⡆⣀⡌⢧⠀⠘⠛⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣾⣬⣹⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠉⠁⠀⢰⣿⣿⣿⠙⡆⢸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⢦⣽⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣾⡟⣿⣿⡏⣡⠏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣸⣿⡿⢳⡀⠀⠀⠀⠀⠐⢶⠀⠀⠀⠀⠀⠀⠀⣸⣿⡇⣿⣿⣿⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⡇⣿⣷⣤⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⠶⣿⣿⣇⣿⢻⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⠻⣿⣿⣿⣷⡙⠦⣤⡀⠀⢀⣠⡤⠖⠛⣡⣾⣿⣿⣿⣿⠈⢿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠟⠀⢹⣿⢻⣿⣿⣦⣌⡉⠉⠉⢀⣀⣠⣾⣿⣿⣿⡏⢹⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠸⡏⠀⣹⣿⣿⣿⡏⠀⢸⣿⣿⣿⣿⣿⣯⣿⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢁⡼⠁⡿⣿⣿⣧⣀⣜⣿⣿⡿⢟⣡⡞⠀⠙⣷⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡴⠋⠀⣸⣿⡿⢿⣴⣿⣿⣷⣶⣿⣿⣿⠁⠀⠀⠈⢻⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡾⠁⠀⢀⣿⢷⣶⣿⠋⠙⣿⣿⣿⣿⣿⡟⠀⠀⠀⠀⣿⠹⣧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣿⠃⠀⠀⣼⣿⠸⣿⣧⣀⣴⣿⣿⣿⣿⣿⠁⠀⠀⠀⠀⣿⠀⠘⣦⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡾⠛⠀⣠⣾⣿⣿⡇⣿⣿⣿⣿⣿⡏⠀⠀⢹⠀⠀⠀⠀⢀⡇⠀⠀⢸⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣸⠇⢠⣾⣿⣿⣿⡿⣱⣿⣿⣿⣿⣿⠃⠉⠉⡟⠀⠀⠀⠀⢸⠁⠀⠀⣼⢷⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⡟⢰⣿⣿⣿⣿⣟⣵⣿⠿⢿⣿⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⢸⠀⢀⡼⠁⠸⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⢿⠃⢸⣿⣿⣿⡏⣾⣿⣇⠀⣨⣽⣿⣿⣿⣿⣿⠁⠀⠀⠀⠀⢸⢠⠎⡇⠀⠀⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⠇⡾⢠⠀⣿⣿⣿⣷⢹⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⣸⠋⢸⡇⠀⠀⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⠏⢰⣇⠸⠀⣸⣿⣿⣿⣷⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡆⠀⠀⠀⣸⠃⠀⢸⠀⠀⠀⢸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡞⠀⢸⢹⠀⠀⣿⡹⣿⣿⣿⣿⣿⡿⠻⡿⣿⣿⣿⣿⣿⡇⠀⠀⣰⠇⠀⠀⡟⠀⠀⠀⠸⣇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣼⠁⠀⡇⠘⠀⣸⣿⣷⣽⣿⣿⣿⣿⣇⠀⣴⣿⣿⣿⣿⣿⡇⠀⢠⠏⠀⠀⠀⡇⠀⠀⠀⢘⣿⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
 * @MarceloNarváez
 */
public class Correcion {
    Scanner scan=new Scanner(System.in);
    public int[] vector;
    
    public int[] Ingresnum(){
        System.out.println("Ingrese los numeros que desee");
        int n=scan.nextInt();
        int[] Vector=new int[n];
        for(int i=0; i<n; i++){
            System.out.println("Ingrese los datos "+(i+1));
            Vector[i]=scan.nextInt();
        }
        return this.vector=Vector;
    }
    
    public int Suma(){
       Ingresnum();
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
    
    public int Potencia(){
        Ingresnum();
        
        if(vector.length<2){
            System.out.println("No se puede realizar ese ejercicio");
            return 0;
        }
        else{
            int Acum1=1;
            int Acum2=1;
            System.out.print("Potencia: ");
            
            for(int i=1; i<vector.length; i++){
                Acum1*=vector[i];
            }   
            for(int i=1; i<=Acum1;i++){
                Acum2*=vector[0];
            }
            System.out.print(vector[0]+"^"+Acum1+" =");
            return Acum2;
        }
    }
    
    public double Promedio1(){
        Ingresnum();
        double Acum=0;
        for(int i=0; i<vector.length; i++){
            Acum+=vector[i];
        }
        System.out.print("Promedio:");
        return Acum/vector.length;
    }
    
    public int Factorial(){
        Ingresnum();
        int Acum3=1;
        System.out.println("Potencia:");
        for(int i=vector[0]; i>1;i--){
            Acum3*=i;
            if(i==2)
               System.out.print(" "+i+" * 1 =");
           else
               System.out.print(" "+i+" *");
        }
        return Acum3;
    }
}
