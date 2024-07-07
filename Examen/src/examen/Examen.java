/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen;
import java.util.*;
/**
 *⠀⠀⠀⠀⠀⠀  ⢀⡤⣤⣀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⣀⡀⠀⠀⠀⠀⠀⠀
    ⠀⠀⠀⠀⠀⢀⡏⠀⠀⠈⠳⣄⠀⠀⠀⠀⠀⣀⠴⠋⠉⠉⡆⠀⠀⠀⠀⠀
    ⠀⠀⠀⠀⠀⢸⠀⠀⠀⠀⠀⠈⠉⠉⠙⠓⠚⠁⠀⠀⠀⠀⣿⠀⠀⠀⠀⠀
    ⠀⠀⠀⠀⢀⠞⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠹⣄⠀⠀⠀⠀
    ⠀⠀⠀⠀⡞⠀⠀⠀⠀⠀⠶⠀⠀⠀⠀⠀⠀⠦⠀⠀⠀⠀⠀⠸⡆⠀⠀⠀
    ⢠⣤⣶⣾⣧⣤⣤⣀⡀⠀⠀⠀⠀⠈⠀⠀⠀⢀⡤⠴⠶⠤⢤⡀⠀
    ⠻⠶⣾⠁⠀⠀⠀⠀⠙⣆⠀⠀⠀⠀⠀⠀⣰⠋⠀⠀⠀⠀⠀⢹⣭⣽⠇
    ⠀⠀⠙⠤⠴⢤⡤⠤⠤⠋⠉⠉⠉⠉⠉⠉⠉⠳⠖⠦⠤⠶⠦⠞⠀
 * @MarceloNarvaez
 */
public class Examen {
    /**
     * @param args the command line arguments
     */
   
public static void main(String args[])
    {
          int min = -1001;
          int max = 1001;
          int num1;
          int opc=1;
          Scanner scan=new Scanner(System.in);
          Scanner Ingresar=new Scanner(System.in);
          QuickSort ao = new  QuickSort();
          QuickSort hs = new QuickSort();
          System.out.println("Ingresar los numeros aleatorios que dese");
          num1=Ingresar.nextInt();
          int A[]=new int[num1];
          for(var i=0;i<num1;i++){
          A[i]=(int)Math.floor(Math.random()*(max-min+1)+min);
          System.out.println(+i+"="+A[i]);
            }
          do{
                System.out.println("Seleccione una opcion");
                System.out.println("1. Quick");
                System.out.println("2. HeapSort");
                System.out.println("3. para salir");
                opc=scan.nextInt();
                switch(opc){
                    case 1:
                        System.out.println("El vector original");
                        ao.mostrar(A);
                        System.out.println("Metodo Quick");
                        ao.AlgoritmoQuickshort(A);
                        ao.mostrar(A); 
                        break;

                    case 2:
                        System.out.println("El vector original");
                        ao.mostrar(A);
                        System.out.println("HeapSort");
                        hs.sort(A);
                        hs.mostrar(A);
                        break;
                    default:
                        System.out.println("Ingrese de nuevo OwO");
                        break;
                }
          }while(opc!=3);
          System.out.println("Adios ( ੭ ･ᴗ･ )੭");
    }
}