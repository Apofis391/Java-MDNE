/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vector;

/**
 *
 * @author alumnos
 */
public class Vector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int v[]={6,5,3,1,8,7,2,4};
        String paises []={"Ecuador","Argentina","Panama", "USA", "Canada"};
        algoritmosOrdenamiento ao=new algoritmosOrdenamiento();
        System.out.println("El vector original");
        ao.mostrar(v);
       System.out.println("El vector ordenado");
        ao.burbuja(v);
        //ao.insercion(v);
       // ao.ordenarString(paises);
        ao.mostrar(v);
       // ao.mostrarString(paises);
        //ao.busquedaSecuencial(v, 4);
        if(ao.busquedaBinaria(v, 4)==-1){
            System.out.println("No existe el dato en el vector");
        }else
            System.out.println("El dato se encuentra en la posicion: "+ao.busquedaBinaria(v, 4));
        
        ao.busquedaSecuencialString(paises, "USA");
        
    }
    
}
