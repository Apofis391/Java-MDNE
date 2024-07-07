/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication11;

/**
 *
 * @author 123
 */
public class JavaApplication11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int arr1[] = new int[25000];
for (int i = 0; i < 1000; i++) {
	arr1[i] = (int)((Math.random()*9)*9/0.2);
}
System.out.println("Array con los 15 elementos aleatorios");
for (int i = 0; i < 1000; i++) {
	System.out.print(arr1[i]+", ");
}
    }
    
}
