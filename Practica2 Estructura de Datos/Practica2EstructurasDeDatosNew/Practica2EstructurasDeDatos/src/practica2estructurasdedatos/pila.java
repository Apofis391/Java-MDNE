/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica2estructurasdedatos;

/**
 *
 * @author Danny
 */
public class pila {
    class Nodo{
        double money;
        int number;
        String tipo;
        Nodo sig;
    }
    private Nodo raiz;
    
   pila(){
        raiz=null;
    }
    
    public void apilar(double x, int y, String s){
        Nodo nuevo;
        nuevo=new Nodo();
        nuevo.money=x;
        nuevo.number=y;
        nuevo.tipo=s;
        if(raiz==null){
            nuevo.sig=null;
            raiz=nuevo;
        }else{
            nuevo.sig=raiz;
            raiz=nuevo;
        }
    }
    
    public void desapilar(){
        if(raiz!=null){
            raiz=raiz.sig;
        }else{
        }
    }
    
    public boolean vacia(){
        if(raiz==null){
            return true;
        }else{
            return false;
        }
    }
    
    public int numero(){
        Nodo recorrido=raiz;
        return recorrido.number;
    }
}
