package tarea.bucles.pkg2;
import java.util.*;

public class TareaBucles2 {
    
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        proceso pr=new proceso();
        int v[]={5,7,3,6,4,7,4,6,9,2};
        int c=0;
        System.out.println("Menu");
        System.out.println("1. Numeros pares e impares");
        System.out.println("2. Promedio notas");
        System.out.print("Escoga una opcion: ");
        do{
            int opc=leer.nextInt();
            
            switch(opc){
                case 1:
                    pr.pares_e_impares();
                    c=1;
                    break;
                case 2:
                    pr.promedio();
                    c=1;
                    break;
                default:
                    System.out.println("ERROR\n\nNumero no valido\nIngrese nuevamente");
                    c=0;
                    break;
            }   
        }while(c==0);
    }
    
}
