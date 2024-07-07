/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea_colas;

/**
 *⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⣼⡟
⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⣼⡿⠁
⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⢰⣮⡿⠁⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⡠⢣⠞⠃⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⢀⠔⡴⠁⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⡠⢢⠞⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀ ⠀⠀⠀⠀⢀⢔⡴⠃⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀ ⠀⠀⠔⡡⠊⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⡀⣠⠞⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⡢⠞⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⢀⢔⡵⠊⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠉⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
 * @author Marcelo Narvaez
 */
public class Class_tarea {
    
    class Nodo{
        int dato;
        Nodo sig;
    }
    
    private Nodo raiz, ultimo;
    
    public Class_tarea(){
        raiz=null;
        ultimo=null;
    }
    
    public boolean vacia(){
        if(raiz==null){
            return true;
        }else{
            return false;
        }  
    }
    
    public void encolar(int x){
        Nodo nuevo;
        nuevo=new Nodo();
        nuevo.dato=x;
        nuevo.sig=null;
        
        if(vacia()){
            raiz=nuevo;
            ultimo=nuevo;
        }else{
            ultimo.sig=nuevo;
            ultimo=nuevo;  
        }  
    }
    
    public void desencolar(){
        if(!vacia()){
            if(raiz==ultimo){
                raiz=null;
                ultimo=null;
            }else{
                raiz=raiz.sig; 
            }
        }
    
    }
    
    public void imprimir(){
        if(!vacia()){
            Nodo recorrido=raiz;
            while(recorrido!=null){
                System.out.print(recorrido.dato+"->" );
                recorrido=recorrido.sig;
            }
            System.out.println();
        }else{
            System.out.println("La cola esta vacia");
        }
    }
    public void orden() {
        int numeros[] = { 1428000000, 1425000000, 340000000, 278000000, 240000000 };
        System.out.println("Orden ascendente:");
        ordSelAsc(numeros);
        for (int num : numeros) {
            System.out.println(num);
        }
        System.out.println("El pais con mayor poblecion es:India con 1.428 millones de habitantes");
    }
    static void ordSelAsc(int[] arreglo) {
        for (int i = 0 ; i < arreglo.length - 1 ; i++) {
            int min = i;
            for (int j = i + 1 ; j < arreglo.length ; j++) {
                if (arreglo[j] < arreglo[min]) {
                    min = j;
                }
            }
            if (i != min) {
                int aux = arreglo[i];
                arreglo[i] = arreglo[min];
                arreglo[min] = aux;
            }
        }
    }
    }
    









