/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuestionario_practica4;
import java.util.*;
/**
 *
 * @author Marcelo Narváez
 */
public class cuestionario_practica4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int total=0,sum1=0,sum2=0;
        ArrayList<ArrayList<Integer>> matriz=new ArrayList<>(3);
        Scanner scan=new Scanner(System.in);
        for(int i=0; i<3; i++){
            matriz.add(new ArrayList(4));
        }
        for(int i=0; i<3; i++){
            for(int j=0; j<4; j++){
                System.out.println("Ingrese el valor fila "+(i+1)+" y columna "+(j+1)+": ");
                int num=scan.nextInt();
                matriz.get(i).add(num);
                total+=num;
                if(num>0){
                    sum1++;
                }
                if(num%2==0){
                    sum2+=num;
                }
            }
        }
        System.out.println("\n A)Los datos de la matriz son:");
        for(int i=0; i<matriz.size(); i++){
            for(int j=0; j<matriz.get(i).size(); j++){
                System.out.print(matriz.get(i).get(j)+" ");
            }
            System.out.println("");
        }
        System.out.println("B)El promedio general es: "+((float)total/12));
        System.out.println("C)El porcentaje de los numeros positivos es: "+((sum1*100)/12)+"%");
        System.out.println("D)La suma de los numeros pares es: "+sum2);
    }
    
}
