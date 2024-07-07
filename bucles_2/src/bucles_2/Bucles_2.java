/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucles_2;
import java.util.*;
public class Bucles_2 {
    /**
     * 
     ╚═( ͡° ͜ʖ ͡°)═╝
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
    public static void main(String[] args) {
        Scanner Leer=new Scanner(System.in);
        Class_de_bucles2 ao=new Class_de_bucles2();
        int v[]={5,7,3,6,4,8,4,6,9,2,1,10};
        int opcion,c=0;
        try{
            do{
                System.out.println("Selecione la respuesta correcta");
                System.out.println("1. Para numeros pares e impares");
                System.out.println("2. Para promedio ");
                System.out.println("3. Para salir");
                System.out.print("Selecione una opcion: ");
                System.out.println("");
                opcion=Leer.nextInt();
                    switch(opcion){
                        case 1:
                            ao.Pares();
                            c=1;
                            break;
                        case 2:
                            ao.Promedio();
                            c=1;
                            break;
                        default:
                            System.out.println("No existe numero vuelva a introducir otro numero");
                            c=0;
                            break;
                    }   
            } while(opcion!=3);
                System.out.println("adiooos");
        }catch(Exception e){
            System.out.println("Existe un error: "+e);
            System.out.println("Vuelva a intentarlo");
        }
        
    }
    
}
