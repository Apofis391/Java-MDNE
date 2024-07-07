/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tarea_colas;

/**
 *              ⠀⠀⠀⣼⡟
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
public class Tareas_colas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Class_tarea mc=new Class_tarea();
        mc.encolar(1428000000);
        mc.encolar(1425000000);
        mc.encolar(340000000);
        mc.encolar(278000000);
        mc.encolar(240000000);
        System.out.println("India: 1.428 millones de habitantes.");
        System.out.println("China: 1.425 millones de habitantes.");
        System.out.println("Estados Unidos: 340 millones de habitantes.");
        System.out.println("Indonesia: 278 millones de habitantes.");
        System.out.println("Pakistán: 240 millones de habitantes.");
        System.out.println();
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
        System.out.println();
        mc.orden();
    }
    
}
