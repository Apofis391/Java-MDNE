/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a.pkg1;

/**
 *
 * @author 123
 */
public class A1 {

    /**
     * @param args the command line arguments
     */
  public static int existeEnArreglo(int[] arreglo, int busqueda) {
  // Demostración con enteros
  int[] numeros = { 50, 21, 6, 97, 18 };
  int numeroBuscado = 20;
  int posicionDeElementoBuscado = existeEnArreglo(numeros, numeroBuscado);
  if (posicionDeElementoBuscado == -1) {
    System.out.println("El elemento NO existe en el arreglo");
  } else {
    System.out.println("El elemento existe en la posición: " + posicionDeElementoBuscado);
  }
      return 0;
}
    
}
