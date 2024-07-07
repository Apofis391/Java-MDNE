/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vectores.matricesparalelos;
import java.util.Scanner;

/**
 *
 * @author alumnos
 */
public class VectoresMatricesParalelos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        metodos m=new metodos();
        m.cargar();
        m.imprimir();
        m.promedio();
        m.imprimirPromedios();
        m.promedioAsignatura();
        m.notaMayor();
        m.notasEstudiante("Maria");
        System.out.println();
    }
    
}
