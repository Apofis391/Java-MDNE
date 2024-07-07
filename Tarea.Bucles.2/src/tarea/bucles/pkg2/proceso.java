package tarea.bucles.pkg2;
import java.util.*;

public class proceso {
    int c=0;
    int acp=0, aci=0;
    Scanner leer=new Scanner(System.in);
    public void pares_e_impares(){
        
        System.out.println("(El proceso acabara cuando ingrese 0)");
        do{
            
            System.out.print("Ingrese un numero: ");
            int n=leer.nextInt();
            
            if(n%2==0){
                acp++;
            }else{
                aci++;
            }            
            
            if(n==0){
                c=1;
            }else{
                
                c=0;
            }  
            
        }while(c==0);
        System.out.println("Cantidad de pares: "+acp);
        System.out.println("Cantidad de impares: "+aci);
    }
    public void promedio(){
        float snotas8=0;
        float snotas7=0;
        int c=0, a=0;
        int ap=0;
        int nap=0;
        
        System.out.println("Cuantas pruebas se va a calificar?");
        
        do{
            int n_pruebas=leer.nextInt();
            if(n_pruebas>0){
                for (int i=0;i<n_pruebas;i++){
                    System.out.println("Ingrese nota #"+(i+1));
                    do{
                        float nota=leer.nextFloat();
                        if(nota>=0 && nota<=10){
                            if(nota>=8){
                                ap++;
                                snotas8=snotas8+nota;
                            }else{
                                nap++;
                                snotas7=snotas7+nota;
                            }
                            c=1;
                        } else{
                            System.out.println("ERROR\nNota fuera del rango permitido\nIngrese nota#"+(i+1));
                            c=0;
                        }
                    }while(c==0);
                }
                System.out.println("El promedio de las personas que aprobaron es: "+(snotas8/n_pruebas));
                System.out.println("El promedio de las personas que no aprobaron es: "+(snotas7/n_pruebas));
                a=1;
            }else{
                System.out.println("Imposible calificar pruebas menores a 0");
                a=0;
            }           
        }while(a==0);
    }
}

























