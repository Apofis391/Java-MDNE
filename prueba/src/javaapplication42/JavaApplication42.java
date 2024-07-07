/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication42;
import java.io.*;
/**
 *
 * @author 123
 */
public class JavaApplication42 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
        File archivo=new File("C:\\Users\\123\\Documents\\NetBeansProjects");
        if(archivo.createNewFile()){
            System.out.println("creado");
        }
        }catch(IOException e){
            System.out.println("no se a creado");
        }
    }
    
}
