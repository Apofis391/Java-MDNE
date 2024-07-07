/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bucles_2;
import java.util.*;
/**
 *
 *╚═( ͡° ͜ʖ ͡°)═╝
    ╚═(███)═╝
    ╚═(███)═╝
    .╚═(███)═╝
    ..╚═(███)═╝
    …╚═(███)═╝
    …╚═(███)═╝
    ..╚═(███)═╝
    .╚═(███)═╝
    ╚═(███)═╝
    .╚═(███)═╝
    ..╚═(███)═╝
    …╚═(███)═╝
    …╚═(███)═╝
    …..╚(███)╝
    ……╚(██)╝
    ………(█)
 * @MarceloNarváez
 */
public class Class_de_bucles2 {
    int num1=0,num2=0, num3=0;
    Scanner Leer=new Scanner(System.in);
    public void Pares(){
        System.out.println("(El proceso acabara cuando ingrese 0)");
            do{
                System.out.print("Ingrese los numeros: en enteros ");
                int n=Leer.nextInt();
                if(n%2==0){
                    num2++;
                }else{
                    num3++;
                }
                if(n==0){
                    num1=1;
                }else{
                    num1=0;
                }
            }while(num1==0);
        System.out.println("Cantidad de pares: "+num2);
        System.out.println("Cantidad de impares: "+num3);
            }
    public void Promedio(){
        float snotas8=0,snotas7=0;
        int c=0, a=0,ap=0,nap=0;
        System.out.println("Cuantas calificaciones son?");
        do{
            int n_pruebas=Leer.nextInt();
            if(n_pruebas>0){
                for (int i=0;i<n_pruebas;i++){
                    System.out.println("Ingreselas notas en numeros enteros #"+(i+1));
                    do{
                        float nota=Leer.nextFloat();
                        if(nota>=0 && nota<=10){
                            if(nota>=8){
                                ap++;
                                snotas8=snotas8+nota;
                            }else{
                                nap++;
                                snotas7=snotas7+nota;
                            }
                            c=1;
                        } else{
                            System.out.println("Nota fuera del rango permitido\nVuelva a ingresar la nota#"+(i+1));
                            c=0;
                        }
                    }while(c==0);
                }
            System.out.println("El promedio de los estudiantes que aprobaron es: "+(snotas8/n_pruebas));
            System.out.println("El promedio de los estudiantes que no aprobaron es: "+(snotas7/n_pruebas));
            a=1;
            }else{
                System.out.println("no se puede calificar pruebas de 0");
                a=0;
            }           
        }while(a==0);
    }
}
