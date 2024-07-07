/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mochila;

/**
 *
 * @author 123
 */
import java.util.Scanner;

public class Mochila {
    private static final int MAX = 30;
    private static final int FALSE = 0;
    private static final int TRUE = 1;
    private static int[] peso = new int[MAX];
    private static int[] valor = new int[MAX];
    private static int[] decision = new int[MAX];
    private static int[] objetos = new int[MAX];
    private static int n;
    private static int Optimo = -1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Capacidad de la mochila: ");
        int capacidad = scanner.nextInt();
        System.out.print("Cantidad de objetos: ");
        n = scanner.nextInt();

        System.out.print("Ingrese pesos: ");
        for (int i = 0; i < n; i++) {
            peso[i] = scanner.nextInt();
        }

        System.out.print("Ingrese valores: ");
        for (int i = 0; i < n; i++) {
            valor[i] = scanner.nextInt();
        }

        bt(0, capacidad, 0);

        System.out.println("\n\nCapacidad de la mochila: " + capacidad);
        System.out.println("Cantidad de elementos: " + n);
        System.out.println("objeto Pesos Valores");
        for (int i = 0; i < n; i++) {
            System.out.println(" " + (i + 1) + "\t" + peso[i] + "\t" + valor[i]);
        }

        System.out.println("\nValor Optimo: " + Optimo);
        System.out.println("Objetos:");
        for (int i = 0; i < n; i++) {
            System.out.println(" " + (i + 1) + " \t-> " + objetos[i]);
        }
    }

    private static void bt(int k, int capNoUsada, int valorActual) {
        int[] candidato = new int[MAX];
        int nroC;

        if (k == n) return;

        nroC = generaCandidatos(k, capNoUsada, candidato);

        for (int i = 0; i < nroC; i++) {
            decision[k] = candidato[i];

            if (decision[k] == TRUE) {
                valorActual += valor[k];

                if (valorActual > Optimo) {
                    objetos[k] = 1;
                    Optimo = valorActual;
                }

                bt(k + 1, capNoUsada - peso[k], valorActual);
            } else {
                bt(k + 1, capNoUsada, valorActual);
            }
        }
    }

    private static int generaCandidatos(int k, int capNoUsada, int[] candidato) {
        candidato[0] = FALSE;

        if (peso[k] <= capNoUsada) {
            candidato[1] = TRUE;
            return 2;
        } else {
            return 1;
        }
    }
}
