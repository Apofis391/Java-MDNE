/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen_final;
import java.io.*;
import java.util.*;
/**
 **
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
public class Objeto {
    public void createFile(){
        FileWriter fw=null;
        try{
            fw=new FileWriter( "Examen.txt");
            PrintWriter pw=new PrintWriter(fw);
            Escribir_Archi(pw);
            fw.close();
        }catch(Exception e){
            System.out.println("Ha ocurrido un error: "+e.getMessage());
        }
    }
    
    public void Escribir_Archi(PrintWriter pw) throws Exception{
        Scanner scan=new Scanner(System.in);
        Scanner rep=new Scanner(System.in);
        String nombre, cedula,provincia;
        int num;
        System.out.println("Ingrese el numero de personas que va a Ingresar");
        num=rep.nextInt();
        for(int i=0;i<num;i++){
                System.out.println("Ingrese nombre y apellidos ");
                nombre=scan.nextLine();
                System.out.println("Ingrese su cedula:");
                cedula=scan.nextLine();
                System.out.println("Ingrese la provincia:");
                provincia=scan.nextLine();
                pw.println(nombre+" : "+cedula+" : "+provincia);
        }
    }
    
    public void Contenedor_Archi1(){
        FileReader fr=null;
        try{
            File archivo=new File("Examen.txt");
            fr=new FileReader(archivo);
            BufferedReader br=new BufferedReader(fr);
            Leeracrchi1(br);

        }catch(Exception e){
            System.out.println("Ocurrio");
        }
    }
    public void Contenedor_Archi2(){
        FileReader fr=null;
        try{
            File archivo=new File("Examen.txt");
            fr=new FileReader(archivo);
            BufferedReader br=new BufferedReader(fr);
            Leer_archi2(br);
            
        }catch(Exception e){
            System.out.println("Ocurrio");
        }
    }
     public void Contenedor_Archi3(){
        FileReader fr=null;
        try{
            File archivo=new File("Examen.txt");
            fr=new FileReader(archivo);
            BufferedReader br=new BufferedReader(fr);
            Leer_archi3(br);
            
        }catch(Exception e){
            System.out.println("Ocurrio");
        }
    } 
    
    public static void Leeracrchi1(BufferedReader br) throws Exception{
        ArrayList<Cliente> lista=new ArrayList<>();
        String linea;
        linea=br.readLine();
        while(linea!=null){
            StringTokenizer token=new StringTokenizer(linea,":");
            Cliente pt=new Cliente();
            pt.nombre=token.nextToken();
            pt.cedula=token.nextToken();
            pt.provincia=token.nextToken();
            lista.add(pt);
            linea=br.readLine();
        }
        ordenar_por_letras(lista);
    }
    public static void Leer_archi2(BufferedReader br) throws Exception{
        ArrayList<Cuidad> lista=new ArrayList<>();
        String linea;
        linea=br.readLine();
        while(linea!=null){
            StringTokenizer token=new StringTokenizer(linea,":");
            Cuidad pt=new Cuidad();
            pt.nombre=token.nextToken();
            pt.cedula=token.nextToken();
            pt.provincia=token.nextToken();
            lista.add(pt);
           linea=br.readLine();
        }
        ordenar_por_letras2(lista);
    }
    public static void Leer_archi3(BufferedReader br) throws Exception{
        ArrayList<Id> lista=new ArrayList<>();
        String linea;
        linea=br.readLine();
        while(linea!=null){
            StringTokenizer token=new StringTokenizer(linea,":");
            Id pt=new Id();
            pt.Cliente=token.nextToken();
            pt.Id=token.nextToken();
            pt.Ciudad=token.nextToken();
           lista.add(pt);
           linea=br.readLine();
        }
        ordenar3(lista);
    }
    public static void ordenar_por_letras(ArrayList<Cliente> lista){
        for(int i=0; i<lista.size()-1;i++){
            for(int j=0; j<lista.size()-i-1;j++){
                if(lista.get(j).nombre.compareToIgnoreCase(lista.get(j+1).nombre)>0){
                    Cliente aux=lista.get(j);
                    lista.set(j,lista.get(j+1));
                    lista.set(j+1, aux);
                }
            }
        }
        
        FileWriter fw=null;
        try{
            fw=new FileWriter( "Examen_ordenado.txt");
            PrintWriter pw=new PrintWriter(fw);
            Rescribir(pw,lista);
            fw.close();
        }catch(Exception e){
            System.out.println("Ha ocurrido un error: "+e.getMessage());
        }
    }
    public static void ordenar_por_letras2(ArrayList<Cuidad> lista){
       for(int i=0; i<lista.size()-1;i++){
            for(int j=0; j<lista.size()-i-1;j++){
                if(lista.get(j).provincia.compareToIgnoreCase(lista.get(j+1).provincia)>0){
                    Cuidad aux=lista.get(j);
                    lista.set(j,lista.get(j+1));
                    lista.set(j+1, aux);
                }
            }
        }
       FileWriter fw=null;
       try{
            fw=new FileWriter("Examen_ordenado.txt");
            PrintWriter pw=new PrintWriter(fw);
            Rescribir2(pw,lista);
            
            fw.close();
        }catch(Exception e){
            System.out.println("Ha ocurrido un error: "+e.getMessage());
        }
    }
     public static void ordenar3(ArrayList<Id> lista){
       for(int i=0; i<lista.size()-1;i++){
            for(int j=0; j<lista.size()-i-1;j++){
                if(lista.get(j).Id.compareToIgnoreCase(lista.get(j+1).Id)>0){
                    Id aux=lista.get(j);
                    lista.set(j,lista.get(j+1));
                    lista.set(j+1, aux);
                }
            }
        }
       FileWriter fw=null;
       try{
            fw=new FileWriter("Examen_ordenado.txt");
            PrintWriter pw=new PrintWriter(fw);
            Rescribir3(pw,lista);
            fw.close();
        }catch(Exception e){
            System.out.println("Ha ocurrido un error: "+e.getMessage());
        }
    }
    public static void Rescribir(PrintWriter pw, ArrayList<Cliente> lista) throws Exception{
        for(int i=0;i<lista.size();i++){
            pw.println(lista.get(i).toString());
        }
    }
    public static void Rescribir2(PrintWriter pw, ArrayList<Cuidad> lista) throws Exception{
        for(int i=0;i<lista.size();i++){
            pw.println(lista.get(i).toString());
        }
    }
    public static void Rescribir3(PrintWriter pw, ArrayList<Id> lista) throws Exception{
        for(int i=0;i<lista.size();i++){
            pw.println(lista.get(i).toString());
        }
    }
    public void Ver_Archivo(){
        FileReader fr =null;
        try{
            File archivo=new File("Examen.txt");
            fr=new FileReader(archivo);
            BufferedReader br=new BufferedReader(fr);
            Leer_Archivo(br);
        }catch (Exception ex) {
           System.out.println("Error al leer la provincia"); 
        }  
    }
    public static void Leer_Archivo(BufferedReader br)throws Exception{
        String linea;
        linea=br.readLine();
        while (linea!=null) {
            System.out.println(linea);
            linea=br.readLine();
        }
    }
    public void Ver_Archivo2(){
        FileReader fr =null;
        try{
            File archivo=new File("Examen_ordenado.txt");
            fr=new FileReader(archivo);
            BufferedReader br=new BufferedReader(fr);
            Leer_Archivo(br);
        }catch (Exception ex) {
           System.out.println("Error al leer la cedula"); 
        }  
    }
    public static void Leer_Archivo2(BufferedReader br)throws Exception{
        String linea;
        linea=br.readLine();
        while (linea!=null) {
            System.out.println(linea);
            linea=br.readLine();
        }
    }
}
