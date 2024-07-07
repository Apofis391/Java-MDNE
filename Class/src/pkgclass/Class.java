/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgclass;
import java.io.*;
/**
 *
 * @author 123
 */
public class Class {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Class obj1 = new Class();
        System.out.println( "Nombre de la clase de obj1: " 
            + obj1.getClass().getName() );
        System.out.println( "Nombre de la superclase de obj1: " 
            + obj1.getClass().getSuperclass() );
        Object obj2 = null;
        System.out.println( "Introduce un 0 o un 1" );
        try {
            int dato = System.in.read();
            if( (char)dato == '0' )
                obj2 = "Esto es un objeto String";
            else 
                obj2 = obj1.getClass().newInstance();
        } catch( Exception e ) {
            System.out.println( "Excepcion " + e );
            }
        System.out.println( "Nombre de la clase de obj2: " 
            + obj2.getClass().getName() );
        System.out.println( "Nombre de la superclase de obj2: " 
            + obj2.getClass().getSuperclass());
        }
    
}
