/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Examen_3;
import java.io.*;
import java.util.*;
import java.io.File;
/**
 *
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
public class Archivos {

    public void menu(){
        
        Scanner teclado=new Scanner(System.in);
        int opcion;
        do{
            System.out.println("1. Crear Archivo");
            System.out.println("2. Ver archivos txt");
            System.out.println("3. Salir");
            System.out.println("Ingrese una opcion");
            opcion=teclado.nextInt();
            switch(opcion){
                case 1:{
                    Guardar_TXT(); 
                    break;
                }
                case 2:{
                   
                    Ver_TXT(); 
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
    
    public void Guardar_TXT(){
        FileWriter fw=null;
        try{
            fw=new FileWriter("datos TxT");
            PrintWriter pw=new PrintWriter(fw);
            Escribir_TXT(pw);
            fw.close();
        }catch (Exception ex) {
            System.out.println("Ocurrio un error "+ex.getMessage());
        }
    }
    
    public void Escribir_TXT(PrintWriter pw)throws Exception{
        Scanner teclado=new Scanner(System.in);
        Scanner lea=new Scanner(System.in);
        String[] valor=new String[20];
        int n;
        System.out.println("Ingrese el numero de estudiantes");
        n=lea.nextInt();        
       for(int i=0;i<n;i++){
            System.out.println("Ingrese el nombre del estudiante");
            valor[i]=teclado.nextLine();
            pw.println(valor[i]);
            System.out.println("Ingrese la cedula del estudiante");
            valor[i]=teclado.nextLine();
            pw.println("Cedula: "+valor[i]);
       } 
    }
    
    public void Ver_TXT(){
        FileReader fr =null;
        try{
            File archivo=new File("datos.txt");
            fr=new FileReader(archivo);
            BufferedReader br=new BufferedReader(fr);
            Leer_TXT(br);
        }catch (Exception ex) {
           System.out.println("Error al leer el archivo"); 
        }  
    }
    
    public static void Leer_TXT(BufferedReader br)throws Exception{
        String linea;
        linea=br.readLine();
        while (linea!=null) {
            System.out.println(linea);
            linea=br.readLine();
        }
    }
    
}
