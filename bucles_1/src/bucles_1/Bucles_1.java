/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucles_1;
import java.util.*;
public class Bucles_1 {
    /**
     *
     * ╚═( ͡° ͜ʖ ͡°)═╝
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
     * @MarceloNarvaez
     */
    public static void main(String[] args) {
        Scanner Leer=new Scanner(System.in);
        int opcion, num1, num2, res;
        try{
            do{
                    System.out.println("Selecione la respuesta correcta");
                    System.out.println("1. Realizar la Suma");
                    System.out.println("2. Realizar la Resta");
                    System.out.println("3. Realizar la Multiplicacion");
                    System.out.println("4. Realizar la Division");
                    System.out.println("5. salir");
                    System.out.println("");
                    opcion=Leer.nextInt();
                switch(opcion){
                    case 1:
                            System.out.println("Esta realizando una Suma de a+a");
                            System.out.print("Ingrese el primer numero solo entero: ");
                            num1=Leer.nextInt();
                            System.out.print("Ingrese el segundo numero solo entero: ");
                            num2=Leer.nextInt();
                            res=num1+num2;
                            System.out.println(num1+" + "+num2+" = "+res);
                        break;
                    case 2:
                            System.out.println("Esta realizando una Resta de a-a");
                            System.out.print("Ingrese el primer numero solo entero: ");
                            num1=Leer.nextInt();
                            System.out.print("Ingrese el segundo numero solo entero: ");
                            num2=Leer.nextInt();
                            res=num1-num2;
                            System.out.println(num1+" - "+num2+" = "+res);
                        break;
                    case 3:
                            System.out.println("Esta realizando una Multiplicacion de axa");
                            System.out.print("Ingrese el primer numero solo entero: ");
                            num1=Leer.nextInt();
                            System.out.print("Ingrese el segundo numero solo entero: ");
                            num2=Leer.nextInt();
                            res=num1*num2;
                            System.out.println(num1+" x "+num2+" = "+res);
                        break;
                    case 4:
                            System.out.println("Esta realizando una Division de a/a");
                            System.out.print("Ingrese el primer numero solo entero: ");
                            num1=Leer.nextInt();
                            System.out.print("Ingrese el segundo numero solo entero: ");
                            num2=Leer.nextInt();
                            if(num2==0){
                                System.out.println("error vuelva ingresar otro numero que no sea entero");
                            } else{
                                res=num1/num2;
                                System.out.println(num1+" / "+num2+" = "+res);
                            }
                        break;
                    default:
                        System.out.println("No existe numero vuelva a introducir otro numero");
                        break;
                }
            } while(opcion!=5);
            System.out.println("Adioooooos");
        }catch(Exception e){
            System.out.println("Existe un error: "+e);
        }
    }
    
}
