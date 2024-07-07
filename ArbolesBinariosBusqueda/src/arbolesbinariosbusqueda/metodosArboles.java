/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arbolesbinariosbusqueda;

import java.util.Vector;

/**
 *
 * @author Ciro
 */
public class metodosArboles {
    class Nodo{
        String info;
        Nodo izq,der;
    }
    Nodo raiz;
    int cantidad;
    int altura;
    
    public metodosArboles(){
        raiz=null;
    }
    
    public void insertar (String x){
        Nodo nuevo;
        nuevo=new Nodo();
        nuevo.info=x;
        nuevo.izq=null;
        nuevo.der=null;
        if(raiz==null){
            raiz=nuevo;
        }else{
            Nodo anterior=null,reco;
            reco=raiz;
            while(reco!=null){
                anterior=reco;
                if(x.compareToIgnoreCase(reco.info)<0){
                    reco=reco.izq;
                }else{
                    reco=reco.der;
                }
            }
            if(x.compareToIgnoreCase(anterior.info)<0){
                anterior.izq=nuevo;
            }else{
                anterior.der=nuevo;
            }
        }
    }
    
    private void imprimePre(Nodo reco){
        //Nodo reco=raiz;
        if(reco!=null){
            System.out.print(reco.info +" ");
            imprimePre(reco.izq);
            imprimePre(reco.der);
        }
    }
    
    private void imprimeIn(Nodo reco){
        //Nodo reco=raiz;
        if(reco!=null){
            imprimeIn(reco.izq);
            System.out.print(reco.info +" ");
            imprimeIn(reco.der);
        }
    }
    
     private void imprimePos(Nodo reco){
        //Nodo reco=raiz;
        if(reco!=null){
            imprimePos(reco.izq);
            imprimePos(reco.der);
            System.out.print(reco.info +" ");
            
        }
    }
    
    //imprimir por niveles o anchura
     
    public void imprimePre (){
        imprimePre(raiz);
        System.out.println();
    }
    
    public void imprimeIn (){
        imprimeIn(raiz);
        System.out.println();
    }
    
    public void imprimePos (){
        imprimePos(raiz);
        System.out.println();
    }
    //Cantidad de nodos del arbol
    
    private void cantidadNodos(Nodo reco){
        if(reco!=null){
            cantidad++;
            cantidadNodos(reco.izq);
            cantidadNodos(reco.der);
        }
    }
    
    public int cantidadNodos(){
        cantidad=0;
        cantidadNodos(raiz);
        return cantidad;
    }
    
    private void retornaAltura(Nodo reco, int nivel){
        if(reco!=null){
            retornaAltura(reco.izq, nivel+1);
            if(nivel>altura){
                altura=nivel;
            }
            retornaAltura(reco.der,nivel+1);
        }
    }
    
    public int retornaAltura(){
        altura=0;
        retornaAltura(raiz,1);
        return altura;
    }
    //nodos hoja
    private void cantidadHojas(Nodo reco){
        if (reco!=null){
            if(reco.izq==null && reco.der==null){
                cantidad++;
            }
            cantidadHojas(reco.izq);
            cantidadHojas(reco.der);
            
        }
    }
    
    public int cantidadHojas(){
        cantidad=0;
        cantidadHojas(raiz);
        return cantidad;
    }
    
    //encontrar el nodo mayor
    public void nodoMayor(){
        if(raiz!=null){
            Nodo reco=raiz;
            while(reco.der!=null){
                reco=reco.der;
            }
            System.out.println("El nodo mayor del arbole es: "+reco.info);
        }
    }
    //encontrar el nodo menor
    
    public void nodoMenor(){
        if(raiz!=null){
            Nodo reco=raiz;
            while(reco.izq!=null){
                reco=reco.izq;
            }
            System.out.println("El nodo menor del arbole es: "+reco.info);
        }
    }
    //borrar elemento menor
    public void borrarMenor(){
        if(raiz!=null){
            if(raiz.izq==null){
                raiz=raiz.der;
            }else{
                Nodo anterior=raiz;
                Nodo reco=raiz.izq;
                while(reco.izq!= null){
                    anterior=reco;
                    reco=reco.izq;
                }
                anterior.izq=reco.der;
            }
        }
    }
    
    //borrar elemento mayor
    
}
