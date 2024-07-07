/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication6;
import java.util.*;
/**
 *
 * @author alumnos
 */
public class MatrizUwU {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num4, num3, num2;
    Scanner s = new Scanner(System.in);
        System.out.println("⠀⠀⠀⠀⠀⣀⣠⣤⣤⣤⢤⣄⢀⣀⠀⠀⠀\n" +
                           "⠀⠀⣠⣶⣿⣿⣿⣿⣿⣯⣾⣿⣿⣿⣧⠀⠀\n" +
                           "⢀⣾⣾⣿⡿⠃⢸⣿⣿⣿⣯⣿⣿⡟⢿⣦⡄\n" +
                           "⠘⢿⣿⡟⡀⢢⣄⠋⠉⠙⢃⣭⡙⠞⣿⣯⠃\n" +
                           "⠀⠨⣿⡇⠀⠙⠛⠁⠀⠀⠘⠛⠃⠀⢸⡟⡄\n" +
                           "⠀⠀⢹⣧⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡮⠗⠀\n" +
                           "⠀⠀⣸⣿⣷⣤⣀⠀⠀⠀⢀⣀⣴⣿⠁⠀⠀\n" +
                           "⠀⠀⣥⡇⣟⣿⣿⣿⠀⢸⢿⣿⣿⣯⡿⠀⠀\n" +
                           "⠀⠀⣿⣿⠛⠋⠋⡀⣆⡎⡈⠋⠙⢻⣷⠇⠀\n" +
                           "⠀⢰⣿⣿⡄⠀⣿⣿⡿⣿⣿⡏⠀⠌⢹⣿⠀");
    System.out.println("");
    System.out.print("Ingrese la pimera fila: ");
    num1 = s.nextInt();
    System.out.print("Ingrese la la primera columna : ");
    num4 = s.nextInt();
    System.out.print("Ingrese la segunda fila: ");
    num3 = s.nextInt();
    System.out.print("Ingrese la segunda columna: ");
    num2 = s.nextInt();
    if (num4 != num3) {
      System.out.println("La multiplicacion de la matriz no es posible");
      return;
    }
    int a[][] = new int[num1][num4];
    int b[][] = new int[num3][num2];
    int c[][] = new int[num1][num2];
    System.out.println("\nIngrese los numeros de la mitriz A : ");
    for (int i = 0; i < num1; i++) {
      for (int j = 0; j < num4; j++) a[i][j] = s.nextInt();
    }
    System.out.println("\nIngrese los numeros de la mitriz B : ");
    for (int i = 0; i < num3; i++) {
      for (int j = 0; j < num2; j++) b[i][j] = s.nextInt();
    }
    System.out.println("\nLa multiplicacion de la matriz : ");
    for (int i = 0; i < num1; i++) {
      for (int j = 0; j < num2; j++) {
        c[i][j] = 0;
        for (int k = 0; k < num4; k++) {
          c[i][j] += a[i][k] * b[k][j];
        }
        System.out.print(c[i][j] + " ");
      }
      System.out.println();
    }
        System.out.println("Fin");
    }
}
