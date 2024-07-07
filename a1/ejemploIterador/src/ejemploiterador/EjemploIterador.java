package ejemploiterador;
import java.util.*;
/**
 *
 * @author alumnos
 */
public class EjemploIterador {

    public static void main(String[] args) {
        Vector v=new Vector();
        for(int i=1;i<=10;i++){
            v.add(new String("Mensaje "+i));
        }
        
        System.out.println("Elementos del vector recorrido por iterator");
        String mensaje;
        Iterator iterator=v.iterator();
        while(iterator.hasNext()){
            mensaje=(String)iterator.next();
            System.out.println(mensaje);
            iterator.remove();
        }
        
        System.out.println("Elementos despues de remover iterator");
        iterator=v.iterator();
        while(iterator.hasNext()){
            mensaje=(String)iterator.next();
            System.out.println(mensaje);
        }
    }
    
}
