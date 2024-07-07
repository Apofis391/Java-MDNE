/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
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
public class Ordenamientonum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ordennum fc = new ordennum();
        int opc;
        Scanner scan=new Scanner(System.in);
         try{
             do{
                
                    fc.estudiante();
                    fc.ingresarnumeros();
                    fc.promedio();
                    fc.ordenar();
                    System.out.println("Ingrese 0 para salir");
                    System.out.println("Ingrese cualquier numero para seguir");
                    opc=scan.nextInt();
                    }while(opc!=0);
            }catch(Exception e){
            System.out.println("Hay un error en: "+e);
            }   
    }
    
}
