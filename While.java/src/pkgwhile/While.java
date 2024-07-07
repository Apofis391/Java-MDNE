package pkgwhile;
import java.util.*;

public class While {
/*
@Michael Villarreal    
*/
    public static void main(String[] args) {
        int c=0, n1, total;
        Scanner leer = new Scanner(System.in);
        System.out.println("Tabla de multiplicar del 10");
        System.out.println("Cuantos datos desea multiplicar?");
        n1 =leer.nextInt();
        while(c<n1){
            c++;
            total= c*10;
            System.out.println(c+" x 10 = "+total);
        }
    } 
}
