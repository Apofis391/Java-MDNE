/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package colas;

/**
 *
 * @author alumnos
 */
public class Colas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        metodosColas mc=new metodosColas();
        mc.encolar(50);
        mc.encolar(25);
        mc.encolar(20);
        mc.encolar(10);
        mc.encolar(5);
        mc.imprimir();
        mc.desencolar();
        mc.imprimir();
        mc.desencolar();
        mc.imprimir();
        mc.desencolar();
        mc.imprimir();
        mc.desencolar();
        mc.imprimir();
        mc.desencolar();
        mc.imprimir();
    }
    
}
