/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package appcalculadora;
import java.util.Scanner;
/**
 *
 * @author alumnos
 */
public class AppCalculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calculadora maths=new Calculadora();
        Scanner scan=new Scanner(System.in);
        
        System.out.println("Ingrese los valores a usar: ");
        
        System.out.print("a: ");
        maths.seta(scan.nextInt());
        
        System.out.println("");
        
        System.out.print("b: ");
        maths.setb(scan.nextInt());
        
        int opc=1;
        do{
            do{
                if(opc>=6 || opc<=0)
                    System.out.println("Esa no es una opcion valida ingrese nuevamente");
                System.out.println("");
            
                System.out.println("Seleccione una opcion");
                System.out.println("1. Suma");
                System.out.println("2. Restar");
                System.out.println("3. Multiplicar");
                System.out.println("4. Dividir");
                System.out.println("5. Salir");
                opc=scan.nextInt();
            
                System.out.println("");
            }while(opc>=6 || opc<=0);
            
            switch(opc){
                case 1:
                    int sumaResultado=maths.Suma(maths.geta(), maths.getb());
                    System.out.println("La suma de los valores "+maths.geta()+" y "+maths.getb()+" es: "+sumaResultado);
                    break;
                    
                case 2:
                    int restaResultado=maths.Resta(maths.geta(), maths.getb());
                    System.out.println("La resta de los valores "+maths.geta()+" y "+maths.getb()+" es: "+restaResultado);
                    break;
                    
                case 3:
                    int multiplicacionResultado=maths.Multiplicacion(maths.geta(), maths.getb());
                    System.out.println("La multiplicacion de los valores "+maths.geta()+" y "+maths.getb()+" es: "+multiplicacionResultado);
                    break;
                    
                case 4:
                    double divisionResultado=maths.Division(maths.geta(), maths.getb());
                    System.out.println("La division de los valores "+maths.geta()+" y "+maths.getb()+" es: "+divisionResultado);
                default:
                    System.out.println("ADIOS");
                    break;
            }
        }while(opc!=5);
    }
    
}
