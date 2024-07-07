/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dajl;
import java.util.Scanner;
/**
 *
 * @author alumnos
 */
public class DAJL {
    
    /**
     * @param args the command line arguments
     */
    private double resultado;
    Scanner scan=new Scanner(System.in);
    
    public static void main(String[] args) {
        try{
            int opc=1;
            DAJL dajl=new DAJL();
            Operaciones op=new Operaciones();
            do{
                do{
                    Scanner scan=new Scanner(System.in);
                    if(opc<1 || opc>5)
                        System.out.println("Esa no es una opcion correcta");
                
                    System.out.println("\tMenu\t\n 1. Suma\n 2. Potencia\n 3. Promedio \n 4. Factorial\n 5.Salir");
                    opc=scan.nextInt();
                
                    System.out.println("");
                    switch(opc){
                        case 1:
                            dajl.setters(op.suma());
                            System.out.print(" "+dajl.getters());
                            System.out.println("");
                            break;
                        case 2:
                            dajl.setters(op.potencia());
                            System.out.print(" "+dajl.getters());
                            System.out.println("");
                            break;
                        case 3:
                            dajl.setters(op.promedio());
                            System.out.print(" "+dajl.getters());
                            System.out.println("");
                            break;
                        case 4:
                            dajl.setters(op.factorial());
                            System.out.print(" "+dajl.getters());
                            System.out.println("");
                            break;
                        case 5:
                            System.out.println("ADIOS");
                            break;
                        default:
                            break;
                    }
                }while(opc<1 || opc>5);
            
            }while(opc!=5); 
        }catch(Exception e){
            System.out.println("Existe un error: "+e);
        }
        
    }
    
    public double getters(){
        return resultado;
    }
    
    public double setters( double number){
        return resultado=number;
    }
}
