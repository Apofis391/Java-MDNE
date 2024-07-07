/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejemplo;
import java.util.*;
/**
 *
 * @author Marcelo.Narvaez
 */
//Ejemplo 2
public class Ejemplo {

    /**
     * @param args the command line arguments
     */
    public class EjemploArrayListConClase {
    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
       ArrayList<Estudiante> es=new ArrayList<>();
       Estudiante e1=new Estudiante("Richard",1);
       es.add(e1);
       Estudiante e2=new Estudiante("Belen",2);
       es.add(e2);
       Estudiante e3=new Estudiante("Daniel",3);
       es.add(e3);
       Estudiante e4=new Estudiante("Jennifer",4);
       es.add(e4);
//INGRESAR DATOS AL ARREGLO CON UN FOR
 for (int j=1;j<3;j++){
           System.out.print("Ingrese el nombre del estudiante: ");
           String nom=in.next();
            System.out.print("Ingrese el nivel del estudiante: ");
           int niv=in.nextInt();
           Estudiante e=new Estudiante(nom,niv);
	es.add(e);
       }
//IMPRIMIR ARRAYLIST
 for(int i=0;i<es.size();i++){
           System.out.print(es.get(i).getNombre()+" ");
           System.out.println(es.get(i).getNivel());
       }
//Modificar Datos 
e3.setNombre("Jhonathan");
       e3.setNivel(8);
       es.set(2, e3);
        System.out.println("Mostrar datos de la lista Modificados");
       for(int i=0;i<es.size();i++){
           System.out.print(es.get(i).getNombre()+" ");
           System.out.println(es.get(i).getNivel());
       }
    }
    }
}
    


