/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea_vectores;
import java.util.*;
/**
 *
 * ⣀⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⣀⠀
⢾⣿⣿⣿⣿⣶⣤⡀⠀⠀⠀⠀⠀⠀⠀⠀⠄⠀⣀⣴⣶⣿⣿⣿⣿⡇
⠈⢿⣿⣿⣿⡛⠛⠈⠳⣄⠂⠀⠀⠀⠀⠀⣠⠞⠉⠛⢻⣿⣿⣿⡟⠀
⠀⠸⣿⣿⣿⠥⠀⠀⠀⠈⢢⠀⠀⠀⠀⡜⠁⠀⠀⠀⢸⣿⣿⣿⠁⠀
⠀⠀⣿⣿⣯⠭⠤⠀⠀⠀⠀⠃⣰⡄⠌⠀⠀⠀⠀⠨⢭⣿⣿⣿⠀⠀
⠀⠀⠹⢿⣿⣈⣀⣀⠀⠀⠠⢴⣿⣿⡦⠀⠀⠀⣀⣈⣱⣿⠿⠃⠀⠀
⠀⠀⠀⢠⣾⣿⡟⠁⠀⠀⠀⠀⣿⣏⠀⠀⠀⠀⠘⣻⣿⣶⠀⠀⠀⠀
⠀⠀⠀⢸⣿⣿⢂⠀⠀⠀⠀⠘⢸⡇⠆⠀⠀⠀⢀⠰⣿⣿⠀⠀⠀⠀
⠀⠀⠀⠈⣿⣷⣿⣆⡀⠀⠀⠁⠈⠀⠠⠀⠀⢀⣶⣿⣿⠏⠀⠀⠀⠀
⠀⠀⠀⠀⠘⣿⣿⣿⣷⣴⡜⠀⠀⠀⠀⣦⣤⣾⣿⣿⡏⠀⠀⠀⠀⠀
⠀⠀⠀⠀⢀⡿⠛⠿⠿⠛⠁⠀⠀⠀⠀⠘⠿⠿⠿⠿⢧⠀⠀⠀⠀⠀
⠀⠀⠀⠀⣾⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⣧⠀⠀⠀⠀
⠀⠀⠀⠀⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠀⠀⠀⠀
 * @author Marcelo Narváez
 */
public class Tarea_vectores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner( System.in );
        Scanner datos = new Scanner(System.in);
        int num;
        System.out.print("Introduzca el numero de veces que desee: " );
        System.out.println("Para determita que numeros son pares o impares");
        num = datos.nextInt();
        int[] miArreglo = new int[num];
        for (int i = 0; i < num; i++) {
            System.out.printf( "Introduzca un numero entero: " );
            miArreglo[i] = teclado.nextInt();
            if ( miArreglo[i] % 2 == 0 )
            {
                System.out.printf( "ES PAR" );
                System.out.println();
            }
            else
            {
                System.out.printf( "ES IMPAR" );
                System.out.println();
            }
        }
        System.out.println("Adios");
    }
}
