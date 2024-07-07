/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica2estructurasdedatos;

/**
 *
 * @author Danny
 */
public class Cola {
    class Nodo{
        pila pi=new pila();
        int llegada;
        Nodo sig;
    }
    private Nodo raiz, ultimo;
    
    public Cola(){
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
    
    public void encolar(int llegada){
        Nodo nuevo;
        nuevo=new Nodo();
        nuevo.llegada=llegada;
        nuevo.sig=null;
        
        if(vacia()){
            raiz=nuevo;
            ultimo=nuevo;
        }else{
            ultimo.sig=nuevo;
            ultimo=nuevo;  
        }
        insertarPila();
    }
    public void insertarPila(){
        Nodo recorrido=raiz;
        String tipo;
        int n=(int)Math.floor(Math.random()*(4-1+1)+1);
        for(int i=1; i<=n; i++){
            double money=(double)Math.floor(Math.random()*(1000-1+1)+1);
            if(1==(int)Math.floor(Math.random()*(2-1+1)+1)){
                tipo="Deposito";
            } else {
                tipo="Transferencia";
            }
            recorrido.pi.apilar(money, i, tipo);
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
    
    public int getllegada(){
        return raiz.llegada;
    }
    
    public int size(){
        if(!vacia()){
            int i=0;
            Nodo recorrido=raiz;
            while(recorrido!=null){
                recorrido=recorrido.sig;
                i++;
            }
            return i;
        }else{
            return 0;
        }
    }
}
