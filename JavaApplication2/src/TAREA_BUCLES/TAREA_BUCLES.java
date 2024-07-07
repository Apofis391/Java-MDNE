/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;
import java.util.*;
/**
 *
 * @author 123
 */
public class TAREA_BUCLES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opc=1;
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡀\n" +
                           "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⡟\n" +
                           "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⡿⠁\n" +
                           "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⣮⡿⠁⠀\n" +
                           "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡠⢣⠞⠃⠀⠀\n" +
                           "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠔⡴⠁⠀⠀⠀⠀\n" +
                           "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡠⢢⠞⠀⠀⠀⠀⠀⠀\n" +
                           "⠀⠀⠀⠀⠀⠀⠀⠀⢀⢔⡴⠃⠀⠀⠀⠀⠀⠀⠀\n" +
                           "⠀⠀⠀⠀⠀⠀⠀⠔⡡⠊⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                           "⠀⠀⠀⠀⠀⡀⣠⠞⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                           "⠀⠀⠀⠀⡢⠞⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                           "⢀⢔⡵⠊⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                           "⠉⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        do{
        System.out.println("Ingrese 1 para salir");
        Scanner in = new Scanner(System.in);
        int i, n, notas_aprobadas, notas_reprobadas;
        double nota, promedio, aprobadas, reprobados;
        notas_aprobadas = 0;
        notas_reprobadas = 0;
        promedio = 0;
        aprobadas = 0;
        reprobados = 0;
        System.out.print("Ingresa numero de estudiantes: ");
        n = in.nextInt();
        in.nextLine();
        for (i=1; i<=n; i++) {
            System.out.print("PROCESO " + i);
            System.out.print("Ingresa las notas: ");
            nota = in.nextDouble();
            in.nextLine();
            if(nota<8)
            {
                notas_reprobadas=notas_reprobadas+1;
                reprobados=reprobados+nota;
            }
            else
            {
                notas_aprobadas=notas_aprobadas+1;
                aprobadas=aprobadas+nota;
            }
            promedio=promedio+nota;
            System.out.println("Valor de promedio de notas: " + promedio);
            System.out.println();
        }
        if (n == 0) {
            promedio = 0;
        } else {
            promedio=promedio/n;
        }
        if (notas_aprobadas == 0) {
            aprobadas = 0;
        } else {
            aprobadas=aprobadas/notas_aprobadas;
        }
        if (notas_reprobadas == 0) {
            reprobados = 0;
        } else {
            reprobados=reprobados/notas_reprobadas;
        }
        System.out.println("Valor de notas aprobadas: " + notas_aprobadas);
        System.out.println("Valor de notas reprobadas: " + notas_reprobadas);
        System.out.println("Valor de promedio notas aprobadas: " + aprobadas);
        System.out.println("Valor de promedio notas reprobadas: " + reprobados);
    }while(opc!=1);
    }
    
}
