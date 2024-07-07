/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication41;
import java.io.FileWriter;
import java.io.File;
import java.util.Scanner;
/**
 *
 * @author 123
 */
public class JavaApplication41 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                File fichero = new File("fichero_leer.txt");
		Scanner s = null;

		try {
			// Leemos el contenido del fichero
			System.out.println("... Leemos el contenido del fichero ...");
			s = new Scanner(fichero);

			// Leemos linea a linea el fichero
			while (s.hasNextLine()) {
				String linea = s.nextLine(); 	// Guardamos la linea en un String
				System.out.println(linea);      // Imprimimos la linea
			}

		} catch (Exception ex) {
			System.out.println("Mensaje: " + ex.getMessage());
		} finally {
			// Cerramos el fichero tanto si la lectura ha sido correcta o no
			try {
				if (s != null)
					s.close();
			} catch (Exception ex2) {
				System.out.println("Mensaje 2: " + ex2.getMessage());
			}
		}
        String[] lineas = { "Uno", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "..." };

		/** FORMA 1 DE ESCRITURA **/
		FileWriter ficheros = null;
		try {

			ficheros = new FileWriter("fichero_escritura.txt");

			// Escribimos linea a linea en el fichero
			for (String linea : lineas) {
				ficheros.write(linea + "\n");
			}

			ficheros.close();

		} catch (Exception ex) {
			System.out.println("Mensaje de la excepción: " + ex.getMessage());
		}
    }
    
}
