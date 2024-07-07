/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package archivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.File;
/**
 *
 * @author alumnos
 */
public class metodosArchivos {
    
    public void menu(){
        Scanner teclado=new Scanner(System.in);
        int opcion;
        do{
            System.out.println("1. Crear Archivo");
            System.out.println("2. Visualizar el contenido del archivo");
            System.out.println("3. Borrar contenido archivo");
            System.out.println("4. Salir");
            System.out.println("Ingrese un aopcion");
            opcion=teclado.nextInt();
            switch(opcion){
                case 1:{
                    crearArchivo(); 
                    //System.out.println("Crear archivo");
                    break;
                }
                case 2:{
                    mostrarContenidoArchivo(); 
                    //System.out.println("Mostrar contenido del archivo");
                    break;
                }
                
                case 3:{
                    borrarContenidoArchivo(); 
                    //System.out.println("Borar el contenido del archivo");
                    break;
                }
                case 4:{
                    
                    System.out.println("Gracias por usar el programa");
                    break;
                }
                default:{
                    System.out.println("Opcion no valida"); 
                }
            
            
            }
        }while (opcion!=4);
    }
    
    public void crearArchivo(){
        FileWriter fw=null;
        //String path:"C:\\Users\\alumnos\\Documents\\NetBeansProjects\\Archivos";
        try{
            fw=new FileWriter("datos.txt");
            PrintWriter pw=new PrintWriter(fw);
            escribirArchivo(pw);
            fw.close();
        }catch (Exception ex) {
            System.out.println("Ocurrio un error "+ex.getMessage());
        }
    }
    
    public void escribirArchivo(PrintWriter pw)throws Exception{
        Scanner teclado=new Scanner(System.in);
        String valor;
        
        System.out.println("Ingrese su cedula");
        valor=teclado.nextLine();
        pw.println("Cedula: "+valor);
        
        System.out.println("Ingrese su nombre");
        valor=teclado.nextLine();
        pw.println(valor);
        
        System.out.println("Ingrese su apellido");
        valor=teclado.nextLine();
        pw.println(valor);
        
        System.out.println("Ingrese la ciudad donde vive");
        valor=teclado.nextLine();
        pw.println(valor);
  
        
    }
    
    public void mostrarContenidoArchivo(){
        FileReader fr =null;
        try{
            File archivo=new File("datos.txt");
            fr=new FileReader(archivo);
            BufferedReader br=new BufferedReader(fr);
            leerArchivo(br);
        }catch (Exception ex) {
           System.out.println("Error al leer el archivo"); 
        }  
    }
    
    public static void leerArchivo(BufferedReader br)throws Exception{
        String linea;
        linea=br.readLine();
        while (linea!=null) {
            System.out.println(linea);
            linea=br.readLine();
        }
    }
    
    public void borrarContenidoArchivo(){
        try{
            PrintWriter pw=new PrintWriter("datos.txt");
            pw.close();
        }catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
