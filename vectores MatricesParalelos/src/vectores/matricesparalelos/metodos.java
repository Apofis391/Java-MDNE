/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package vectores.matricesparalelos;
import java.util.Scanner;
/**
 *
 * @author alumnos
 */
public class metodos {
    private Scanner entrada;
    private String[] estudiantes;
    private int [][] notas;
    private double[] promedionotas;
    
    public void cargar(){
        entrada=new Scanner(System.in);
        estudiantes=new String[2];
        notas=new int[2][3];
        for(int f=0;f<estudiantes.length;f++){
            System.out.println("Ingrese el nombre del estudiante "+(f+1));
            estudiantes[f]=entrada.next();
            for(int c=0;c<notas[f].length;c++ ){
                System.out.println("Ingrese la nota de la asignatura "+(c+1));
                notas[f][c]=entrada.nextInt();
            }
        }
    }
    
    public void imprimir(){
        System.out.println("Notas de los estudiantes");
        System.out.println("Estudiante\tED\tPOO\tISC");
        for(int f=0;f<estudiantes.length;f++){
            System.out.print(estudiantes[f]+"\t");
            for(int c=0;c<notas[f].length;c++){
                System.out.print("\t" +notas[f][c]);
            }
            System.out.println();
        }
    }
    
    public void promedio(){
        promedionotas=new double[2];
        for(int f=0;f<notas.length;f++){
            int suma=0;
            for(int c=0;c<notas[f].length;c++){
                suma=suma+notas[f][c];
            }
            promedionotas[f]=suma/notas[f].length;
        }
    }
    
    
    public void promedioAsignatura(){
        //promedionotas=new double[2];
        for(int c=0;c<3;c++){
            double suma=0;
            for(int f=0;f<2;f++){
                
                suma=suma+notas[f][c];
            }
            System.out.println(suma/2);
        }
          System.out.println("");
    }
   
    public void notaMayor(){
        int mayor=0;
        String nombre=estudiantes[0];
        for(int f=0;f<notas.length;f++){
            for(int c=0; c<notas[f].length;c++){
                if(notas[f][c]>mayor){
                    mayor=notas[f][c];
                    nombre=estudiantes[f];
                }
            }
        }
        System.out.println("El estudiante con mayor nota es "+nombre);
    
    }
    
    //realizar un metodo que muetre las notas del estudainte que se envia como parametr
    
    public void notasEstudiante(String nombre){
        int posicion=-1;
		int f=0;
		while(f<estudiantes.length && posicion==-1){
			if(estudiantes[f].equals(nombre)){
                            posicion=f;
                            System.out.print("Las notas del estudiante "+estudiantes[posicion]+"\tes: ");
                            for(int c=0;c<notas[posicion].length;c++){
                                if(c==notas[posicion].length-1)
                                System.out.print(notas[posicion][c]+".");
                                else
                                    System.out.print(notas[posicion][c]+", ");
                            }
                            System.out.println();
                        }
			f++;
		}
                if(posicion==-1){
                    System.out.println("El estudiante no existe");
		}
    
    }
    
    public void imprimirPromedios(){
        System.out.println("El promedio de los estudiantes es:");
        System.out.println("Estudiante \t Promedio");
        for(int i=0;i<promedionotas.length;i++){
            System.out.println(estudiantes[i] +"\t"+promedionotas[i]);
        }
    }
    
    
}
