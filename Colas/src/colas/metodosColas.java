/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colas;

/**
 *
 * @author alumnos
 */
public class metodosColas {
    
    class Nodo{
        int dato;
        Nodo sig;
    }
    
    private Nodo raiz, ultimo;
    
    public metodosColas(){
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
    
/* Tarea: Modificar la cola, para agregar paises y poblacion, luego implementar 
los mismos metodos (vacia(), encolar(), deescolar(), visualizar(), 
agregar:El metodo que muestra el pais con, mayor poblacion; Un metodo para devolver la poblacion 
del pais que se envia como parametro)*/
}









