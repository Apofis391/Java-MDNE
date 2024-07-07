package tarea.bucles.java;
import java.util.*;
public class TareaBuclesJava {
/*
    @Michael Villarreal
*/
    public static void main(String[] args) {
        //Ejercicio con do while
        Scanner leer=new Scanner(System.in);
        int opc, n1, n2, total;
        String opc1, opc2;
        
        do{
            System.out.println("Ingrese el tipo de calculo");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicacion");
            System.out.println("4. Division");
            System.out.print("\nEscoga una opcion: ");
            opc=leer.nextInt();
        
        switch(opc){
            case 1:
                do{
                    System.out.println("Suma");
                    System.out.print("Ingrese el primer numero entero: ");
                    n1=leer.nextInt();
                    System.out.print("Ingrese el segundo numero entero: ");
                    n2=leer.nextInt();
                    total=n1+n2;
                    System.out.println(n1+" + "+n2+" = "+total);
                    leer.nextLine();
                    System.out.println("Quiere hacer otro calculo? (S/N)");
                    opc1=leer.nextLine(); 
                }while(opc1.equals("S")||opc1.equals("s"));
                
                break;
            case 2:
                do{
                    System.out.println("Resta");
                System.out.print("Ingrese el primer numero entero: ");
                n1=leer.nextInt();
                System.out.print("Ingrese el segundo numero entero: ");
                n2=leer.nextInt();
                total=n1-n2;
                System.out.println(n1+" - "+n2+" = "+total);
                   leer.nextLine();
                   System.out.println("Quiere hacer otro calculo? (S/N)");
                   opc1=leer.nextLine(); 
                }while(opc1.equals("S")||opc1.equals("s"));
                
                break;
            case 3:
                do{
                    System.out.println("Multiplicacion");
                System.out.print("Ingrese el primer numero entero: ");
                n1=leer.nextInt();
                System.out.print("Ingrese el segundo numero entero: ");
                n2=leer.nextInt();
                total=n1*n2;
                System.out.println(n1+" x "+n2+" = "+total);
                   leer.nextLine();
                   System.out.println("Quiere hacer otro calculo? (S/N)");
                   opc1=leer.nextLine(); 
                }while(opc1.equals("S")||opc1.equals("s"));
                
                break;
            case 4:
                do{
                    System.out.println("Division");
                System.out.print("Ingrese el primer numero entero: ");
                n1=leer.nextInt();
                System.out.print("Ingrese el segundo numero entero: ");
                n2=leer.nextInt();
                if(n2==0){
                    System.out.println("Infinito");
                } else{
                    total=n1/n2;
                    System.out.println(n1+" / "+n2+" = "+total);
                }
                   leer.nextLine();
                   System.out.println("Quiere hacer otro calculo? (S/N)");
                   opc1=leer.nextLine(); 
                }while(opc1.equals("S")||opc1.equals("s"));
                break;
            default:
                System.out.println("No existe numero");
                break;
        }
            System.out.println("Quiere cerrar la aplicacion? (S/N)");
            opc2=leer.nextLine();
	} while(opc2.equals("n")||opc2.equals("N"));  
    }
}
