/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Examen_2;

/**
 *
 * @author 123
 */
public class metodosArboles {
    class Nodo{
        String info;
        Nodo izq,der;
        int infom;
    }
Nodo raiz;
    
    public metodosArboles(){
        raiz=null;
    }
    public void insertarr (int x){
        Nodo nuevo;
        nuevo=new Nodo();
        nuevo.infom=x;
        nuevo.izq=null;
        nuevo.der=null;
        
        if(raiz==null){
            raiz=nuevo;
        }else{
            Nodo anterior=null,reco;
            reco=raiz;
            while(reco!=null){
                anterior=reco;
                if(x<reco.infom){
                    reco=reco.izq;
                }else{
                    reco=reco.der;
                }
            }
            if(x<anterior.infom){
                anterior.izq=nuevo;
            }else{
                anterior.der=nuevo;
            }
        }
    }
    
    private void imprimePres(Nodo reco){
        //Nodo reco=raiz;
        if(reco!=null){
            
            System.out.print(" El nombre del Cliente es:");
            System.out.print(reco.info +" ");
            imprimePres(reco.izq);
            System.out.print(" Su numero es :");
            System.out.print(reco.infom +"");
            imprimePres(reco.der);
        }
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
    public void imprimePre (){
        imprimePre(raiz);
        System.out.println();
    }
    public void imprimePres(){
        imprimePres(raiz);
        System.out.println();
    }
}
