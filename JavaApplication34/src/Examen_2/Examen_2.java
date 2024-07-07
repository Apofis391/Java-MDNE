/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Examen_2;
import java.util.*;
/**
 *
 * @author 123
 */
public class Examen_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        metodosArboles ma=new metodosArboles();
        Random rand=new Random();
        int cantidad= rand.nextInt(10);
        for(int i=1;i<=cantidad; i++){
            int number=(int)Math.floor(Math.random()*(122-97)+97);
            String n="";
            n+=(char)number;
            ma.insertar(n);
        } 
        ma.insertarr(1);
        ma.insertarr(2);
        ma.insertarr(3);
        ma.insertarr(4);
        ma.insertarr(5);
        ma.insertarr(6);
        ma.insertarr(7);
        ma.insertarr(8);
        ma.insertarr(9);
        ma.insertarr(10);
        ma.imprimePres();
        
       
    }
    
}
