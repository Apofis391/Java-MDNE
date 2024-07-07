/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vector;

/**
 *
 * @author alumnos
 */
public class algoritmosOrdenamiento {
    
    public void burbuja(int[] v){
        for(int i=0;i<v.length;i++){
            for(int j=0; j<v.length-i-1;j++){
                if(v[j]>v[j+1]){
                    int aux;
                    aux=v[j];
                    v[j]=v[j+1];
                    v[j+1]=aux;
                }
            }
        }
    }
    
    public void insercion(int[] v){
        for(int i=0;i<v.length;i++){
            int aux=v[i];
            int j;
            for(j=i-1;j>=0 && v[j]>aux;j--){
                v[j+1]=v[j];
            }
            v[j+1]=aux;
        }
    }
    
    public void ordenarString(String[] paises){
        for(int i=0;i<paises.length;i++){
            for(int j=0; j<paises.length-i-1;j++){
                if(paises[j].compareTo(paises[j+1])>0){
                    String aux;
                    aux=paises[j];
                    paises[j]=paises[j+1];
                    paises[j+1]=aux;
                }
            }
        }
    }
    
    
    public void busquedaSecuencial(int[] v, int dato){
        int posicion=0;
        boolean bandera=false;
        for(int i=0; i<v.length;i++ ){
            if(v[i]==dato ){
               posicion=i;
               bandera=true;
            }
        }
        
        if(bandera){
            System.out.println("El dato :" +dato + "se encuentra en la posicion: "+posicion);
        }else{
            System.out.println("El dato no se encuentra en el vector");
        }
    }
    
     public void busquedaSecuencialString(String[] paises, String dato){
        int posicion=0;
        boolean bandera=false;
        for(int i=0; i<paises.length;i++ ){
            if(paises[i].equals(dato)){
               posicion=i;
               bandera=true;
            }
        }
        
        if(bandera){
            System.out.println("El pais: " +dato + " se encuentra en la posicion: "+posicion);
        }else{
            System.out.println("El pais no se encuentra en el vector");
        }
    }
     
    
    public int busquedaBinaria(int  v[],int dato) {
       int centro, inf = 0, sup = v.length - 1;
       while (inf <= sup) {
           centro = ((sup + inf) / 2);
           if (v[centro] == dato) {
               return centro;
           } else if (dato < v[centro]) {
               sup = centro - 1;
           } else {
               inf = centro + 1;
           }
       }
       return -1;
    }
    
    
    public void mostrar(int[] v){
        for(int i=0;i<v.length;i++){
            System.out.println(v[i]);
        }
    
    }
    
    public void mostrarString(String[] paises){
        for(int i=0;i<paises.length;i++){
            System.out.println(paises[i]);
        }
    
    }
}
