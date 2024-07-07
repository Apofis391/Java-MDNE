/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordenamientonum;
import java.util.*;
/**
 *⠀⠀⠀⠀⠀⢀⡤⠴⠒⠒⠒⠒⠦⠤⣴⣷⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⢀⡔⠉⠀⠀⠀⠀⠀⠀⠀⢀⣽⣿⡏⠉⠀⠀⠀⠀⠉⠑⠢⣄⠀⠀⠀
⠀⠀⠀⡎⠀⠀⠀⠀⠀⢀⣠⡴⠚⠉⠸⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠈⢷⣡⢢
⠀⠀⡼⣰⣳⣦⡑⣤⠞⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⠛⠉
⠀⣸⠁⣿⣿⣿⣿⡎⢣⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⡴⠃⠀⠀
⠾⠛⣆⢿⣿⣿⣿⣿⢸⠆⠀⠀⠀⠐⣟⡒⢤⡤⢄⣀⣤⡤⠖⠋⠁⠀⠀⠀⠀
⠀⠀⠘⠧⣿⣿⣟⣫⠞⠑⠒⠢⢄⡀⠀⠉⠁⡽⠛⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣿⣤⡤⠴⠷⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡏⠀⠀⠀⠀⠈⠳⣄⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⡏⡄⠀⠀⡄⠀⠀⠀⠹⡄⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣾⢃⡧⠀⠀⢹⡄⠀⠀⢀⡟⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⢠⡄⣒⡪⠽⠿⣼⣦⣇⣴⠜⠃⠀⢠⠞⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢨⠇⠀⠀⢲⠀⢸⡀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⡤⠤⠚⠀⠀⠀⠈⠉⠒⠒⡒⠯⣍⠓⢦⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⠧⠤⢤⣀⣀⣀⣀⣀⣀⣰⣀⣈⠦⠜⠒⠋⠀⠀⠀
 * @author_Marcelo_Narváez
 */
public class ordennum {
     private int  a, b, c,suma,prom;
     private String nom_a,nom_b,nom_c;
    Scanner entrada = new Scanner(System.in);
   
   public void estudiante(){
        entrada=new Scanner(System.in);
            System.out.println("Ingrese el nombre del estudiante 1");
            nom_a = entrada.nextLine();
            System.out.println("Ingrese el nombre del estudiante 2");
            nom_b = entrada.nextLine();
            System.out.println("Ingrese el nombre del estudiante 3");
            nom_c = entrada.nextLine();
            
   }
   public void ingresarnumeros() {
        System.out.println("Por favor ingrese 3 numeros");
        System.out.print("Ingrese nota de estudiante 1: ");
        a = entrada.nextInt();
        System.out.print("Ingrese nota de estudiante 2: ");
        b = entrada.nextInt();
        System.out.print("Ingrese nota de estudiante 3: ");
        c = entrada.nextInt();     
    }
   
   public void promedio(){
       int sum_a=a;
       int sum_b=b;
       int sum_c=c;
       suma=sum_a+sum_b+sum_c;
       prom=suma/3;
       System.out.println("La suma de las notas es: "+suma);
       System.out.println("El promedio del curso es: "+prom);
   }
    public void ordenar() {
        if(a>b) {
            if(a>c) {
                if(b>c) {
                    System.out.println("Orden Ascendente: " +nom_c+"="+ c + " "+nom_b+"=" + b + " "+nom_a +"="+ a);
                    System.out.println("Orden descendente: "+nom_a +"="+ a + " "+nom_b+"=" + b + " " +nom_c+"="+ c);                 
                }else {
                    System.out.println("Orden Ascendente: " +nom_a+"="+ a + " "+nom_c+"=" + c + " "+nom_b+"=" + b);
                    System.out.println("Orden descendente: " +nom_b+"="+ b + " "+nom_c+"=" + c + " "+nom_a +"="+ a);
                }
            }else {
                System.out.println("Orden Ascendente: " +nom_b+"="+ b + " "+nom_a +"="+ a + " "+nom_c+"=" + c);
                System.out.println("Orden descendente: " +nom_c+"="+ c + " "+nom_a +"="+ a + " "+nom_b+"=" + b);
            }
        }else {
            if(b>c) {
                if(a>c) {
                    System.out.println("Orden Ascendente: " +nom_c+"="+ c + " " +nom_a+"="+ a + " " +nom_b+"="+ b);
                    System.out.println("Orden descendente: " +nom_b+"="+ b + " " +nom_a+"="+ a + " "+nom_c+"=" + c);
                }else {
                    System.out.println("Orden Ascendente: " +nom_a+"="+ a + " " +nom_c+"="+ c + " "+nom_b+"=" + b);
                    System.out.println("Orden descendente: " +nom_b+"="+ b + " "+nom_c+"=" + c + " "+nom_a +"="+ a);
                }              
            }else {
                System.out.println("Orden Ascendente: " +nom_a+"="+ a + " " +nom_b+"="+ b + " " +nom_c+"="+ c);
                System.out.println("Orden descendente: " +nom_c+"="+ c + " " +nom_b+"="+ b + " " +nom_a+"="+ a);
            }
        }
    }
}
