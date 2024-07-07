/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase;

/**
 *
 * @author alumnos
 */
public class algoritmo_orden {
    
    public void burbuja(int[] v){
        for(int i=0;i<v.length;i++){
            for(int j=0;j<v.length-i-1;j++){
                if(v[j]>v[j+1]){
                    int aux;
                    aux=v[j];
                    v[j]=v[j+1];
                    v[j+1]=aux;
                }
            }
        }
    }
     public void inseccion(int[]v){
        for(int i=1;i<v.length;i++){
            int aux=v[i];
            int j;
            for(j=i-1;j>=0 && v[j]>aux;j--){
                v[j+1]=v[j];
            }
            
            v[j+1]=aux;
        }
    }  
    public void mostrar(int[]v){
        for(int i=0;i<v.length;i++){
            System.out.println(v[i]);
            
        }
    }
}
