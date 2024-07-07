/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Examen_3;

import java.io.*;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.File;
import java.util.*;
/**
 ⠀⠀⠀⠀⠀⠀⠀⠀⣠⣴⣶⡋⠉⠒⢤⡀⠀⠀⠀⠀⠀⢠⠖⠉⠉⠙⠢⡄⠀
⠀⠀⠀⠀⠀⠀⢀⣼⣟⡒⠒⠀⠀⠀⠀  ⠙⣆⠀⠀⠀⢠⠃⠀⠀⠀⠀ ⠀⠹⡄
⠀⠀⠀⠀⠀⠀⣼⠷⠖⠀⠀⠀⠀⠀⠀⠀   ⠘⡆⠀⠀⡇⠀⠀⠀⠀⠀ ⠀⠀⢷
⠀⠀⠀⠀⠀⠀⣷⡒⠀⠀⢐⣒⣒⡒⠀⣐⣒⣒ ⣧⠀⠀⡇⠀⢠⢤⢠⡠⠀⢸
⠀⠀⠀⠀⠀⢰⣛⣟⣂⠀⠘⠤⠬⠃⠰⠑⠥⠊⣿⠀⢴⠃⠀⠘⠚⠘⠑⠐⢸
⠀⠀⠀⠀⠀⢸⣿⡿⠤⠀⠀⠀⠀⠀⢀⡆⠀ ⠀⣿⠀⠀⡇⠀⠀⠀⠀⠀⠀ ⠀⣸
⠀⠀⠀⠀⠀⠈⠿⣯⡭⠀⠀⠀⠀⢀⣀⠀⠀⠀⡟⠀  ⢸⠀⠀⠀⠀⠀  ⢠⠏
⠀⠀⠀⠀⠀⠀⠀⠈⢯⡥⠄⠀⠀⠀⠀ ⠀⠀⡼⠁⠀⠀⠀⠳⢄⣀⣀⣀⡴⠃⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⢱⡦⣄⣀⣀⣀⣠⠞⠁⠀⠀⠀⠀⠀⠀⠈⠉⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⢀⣤⣾⠛⠃⠀⠀⠀⢹⠳⡶⣤⡤⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⣠⢴⣿⣿⣿⡟⡷⢄⣀⣀⣀⡼⠳⡹⣿⣷⠞⣳⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⢰⡯⠭⠹⡟⠿⠧⠷⣄⣀⣟⠛⣦⠔⠋⠛⠛⠋⠙⡆⠀⠀⠀⠀⠀⠀⠀
⠀⠀⢸⣿⠭⠉⠀⢠⣤⠀⠀⠀⠘⡷⣵⢻⠀⠀⠀⠀⣼⠀⣇⠀⠀⠀⠀⠀⠀⠀
⠀⠀⡇⣿⠍⠁⠀⢸⣗⠂⠀⠀⠀⣧⣿⣼⠀⠀⠀⠀⣯⠀⢸⠀⠀⠀⠀⠀⠀⠀
 * @author Marcelo Narváez
 */
public class Archivo {

    
    
    public void menu(){
        Scanner teclado=new Scanner(System.in);
        int opcion;
        do{
            System.out.println("1. Crear Archivo");
            System.out.println("2. Ver el Almacenamiento");
            System.out.println("3. Salir");
            System.out.println("Ingrese una opcion");
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
        //File nombreFile = new File("C:\\Users\\alumnos\\Documents\\NetBeansProjects\\Archivos");
        try{
            
            fw=new FileWriter("C:\\Users\\alumnos\\Documents\\NetBeansProjects\\Archivos");
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
        System.out.println("Ingrese la cedula del estudiante ");
        valor=teclado.nextLine();
        pw.println("Cedula: "+valor);
        
        System.out.println("Ingrese el nombre del estudiante ");
        valor=teclado.nextLine();
        pw.println(valor);
        
        System.out.println("Ingrese el apellido del estudiante");
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
    
}
