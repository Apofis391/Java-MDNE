/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Correcion_del_examen;
import java.util.*;
/**
 *⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣤⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⡀⣸⣿⣿⣷⣄⠀⠀⠀⠀⣀⡀⠀⠀⠀⢀⣠⣤⣤⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⣴⣿⣿⣿⣿⡿⣿⣿⣷⣦⣴⣿⣿⣿⣄⣠⠶⣿⡿⢿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣶⣿⡿⠿⢛⣿⣿⣿⣷⣮⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣯⠽⢿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⣿⣿⣿⣿⣿⠟⠉⠀⠀⠀⠀⠈⠛⠻⠿⣽⣿⣿⣿⢻⣿⡹⣶⡾⣿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣿⣿⢟⣾⢏⡤⠴⠶⠆⠀⠀⠀⠀⠀⠤⠤⣄⣻⣿⣿⣾⡏⣷⠽⣿⡋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣾⣿⣧⣾⡟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢹⣿⣿⣿⡇⣿⣷⣿⣿⡁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣾⠿⠛⣿⣿⣿⣠⣤⡴⣦⣝⣦⠀⠀⠀⠀⠖⣋⣡⣤⣸⡇⢻⣿⣿⣿⣿⣼⢻⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠁⠀⠀⣿⣿⣧⠟⢁⣠⣄⡉⠹⠀⠀⠀⠀⠚⠉⢹⡉⠙⠻⣦⣿⣿⣯⣭⡿⢦⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣹⣿⣿⣦⣮⣶⣷⣽⣤⠀⠀⠀⠀⣰⣯⣅⡙⢧⠀⢹⣿⣿⣿⣿⣇⠀⠹⣷⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⣋⣿⡇⠈⢻⣿⣿⠿⠁⠀⠀⠀⠀⠻⣿⣿⣿⣿⠁⠀⣾⣿⡆⣀⡌⢧⠀⠘⠛⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣾⣬⣹⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠉⠁⠀⢰⣿⣿⣿⠙⡆⢸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⢦⣽⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣾⡟⣿⣿⡏⣡⠏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣸⣿⡿⢳⡀⠀⠀⠀⠀⠐⢶⠀⠀⠀⠀⠀⠀⠀⣸⣿⡇⣿⣿⣿⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⡇⣿⣷⣤⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⠶⣿⣿⣇⣿⢻⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⠻⣿⣿⣿⣷⡙⠦⣤⡀⠀⢀⣠⡤⠖⠛⣡⣾⣿⣿⣿⣿⠈⢿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠟⠀⢹⣿⢻⣿⣿⣦⣌⡉⠉⠉⢀⣀⣠⣾⣿⣿⣿⡏⢹⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠸⡏⠀⣹⣿⣿⣿⡏⠀⢸⣿⣿⣿⣿⣿⣯⣿⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢁⡼⠁⡿⣿⣿⣧⣀⣜⣿⣿⡿⢟⣡⡞⠀⠙⣷⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡴⠋⠀⣸⣿⡿⢿⣴⣿⣿⣷⣶⣿⣿⣿⠁⠀⠀⠈⢻⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡾⠁⠀⢀⣿⢷⣶⣿⠋⠙⣿⣿⣿⣿⣿⡟⠀⠀⠀⠀⣿⠹⣧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣿⠃⠀⠀⣼⣿⠸⣿⣧⣀⣴⣿⣿⣿⣿⣿⠁⠀⠀⠀⠀⣿⠀⠘⣦⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡾⠛⠀⣠⣾⣿⣿⡇⣿⣿⣿⣿⣿⡏⠀⠀⢹⠀⠀⠀⠀⢀⡇⠀⠀⢸⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣸⠇⢠⣾⣿⣿⣿⡿⣱⣿⣿⣿⣿⣿⠃⠉⠉⡟⠀⠀⠀⠀⢸⠁⠀⠀⣼⢷⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⡟⢰⣿⣿⣿⣿⣟⣵⣿⠿⢿⣿⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⢸⠀⢀⡼⠁⠸⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⢿⠃⢸⣿⣿⣿⡏⣾⣿⣇⠀⣨⣽⣿⣿⣿⣿⣿⠁⠀⠀⠀⠀⢸⢠⠎⡇⠀⠀⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⠇⡾⢠⠀⣿⣿⣿⣷⢹⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⣸⠋⢸⡇⠀⠀⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⠏⢰⣇⠸⠀⣸⣿⣿⣿⣷⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡆⠀⠀⠀⣸⠃⠀⢸⠀⠀⠀⢸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡞⠀⢸⢹⠀⠀⣿⡹⣿⣿⣿⣿⣿⡿⠻⡿⣿⣿⣿⣿⣿⡇⠀⠀⣰⠇⠀⠀⡟⠀⠀⠀⠸⣇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣼⠁⠀⡇⠘⠀⣸⣿⣷⣽⣿⣿⣿⣿⣇⠀⣴⣿⣿⣿⣿⣿⡇⠀⢠⠏⠀⠀⠀⡇⠀⠀⠀⢘⣿⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
 * @MarceloNarváez
 */
public class Correcion_del_examen {
    
    /**
     * @param args the command line arguments
     */
    private double Resul;
    public static void main(String[] args) {
        try{
            int opc=1;
            Correcion_del_examen MD=new Correcion_del_examen();
            Correcion op=new Correcion();
            do{
                do{
                    Scanner scan=new Scanner(System.in);
                    if(opc<1 || opc>5)
                        System.out.println("Esa opcion no existe ingrese de nuevo");
                
                    System.out.println("Menu");
                    System.out.println("Selencione una opcion");
                    System.out.println("1. Suma");
                    System.out.println("2. Potencia");
                    System.out.println("3. Promedio");
                    System.out.println("4. Factorial");
                    System.out.println("5. Salir");
                    opc=scan.nextInt();
                
                    System.out.println("");
                    switch(opc){
                        case 1:
                            MD.setters(op.Suma());
                            System.out.print(" "+MD.getters());
                            System.out.println(" ");
                            break;
                        case 2:
                            MD.setters(op.Potencia());
                            System.out.print(" "+MD.getters());
                            System.out.println(" ");
                            break;
                        case 3:
                            MD.setters(op.Promedio1());
                            System.out.print(" "+MD.getters());
                            System.out.println(" ");
                            break;
                        case 4:
                            MD.setters(op.Factorial());
                            System.out.print(" "+MD.getters());
                            System.out.println(" ");
                            break;
                        case 5:
                            System.out.println("Adios OwO");
                            break;
                        default:
                            break;
                    }
                }while(opc<1 || opc>5);
            
            }while(opc!=5); 
        }catch(Exception e){
            System.out.println("Hay un error en: "+e);
        }
        
    }
    
    public double getters(){
        return Resul;
    }
    
    public double setters( double number){
        return Resul=number;
    }
}
