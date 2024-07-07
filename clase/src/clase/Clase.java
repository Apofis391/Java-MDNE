/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase;

/**
 *
 * @author alumnos
 */
public class Clase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int v[]={6,5,3,1,8,7,2,4};
        algoritmo_orden ao=new algoritmo_orden();
        System.out.println("El vector original");
        ao.mostrar(v);
        System.out.println("vector ordenado");
        ao.burbuja(v);
        ao.mostrar(v);
        System.out.println("otra forma");
        ao.inseccion(v);
        ao.mostrar(v);
    }
    
}
