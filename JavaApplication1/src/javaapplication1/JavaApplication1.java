/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;
import java.io.IOException;
/**
 *
 * @author 123
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException, InterruptedException {
        // TODO code application logic here
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n" +
                           "░█░░░█░█▀▀░█░░░█▀▀░█▀█░██░██░█▀▀░\n" +
                           "░█░█░█░█▀▀░█░░░█░░░█░█░█░█░█░█▀▀░\n" +
                           "░▀▀░▀▀░▀▀▀░▀▀▀░▀▀▀░▀▀▀░▀░░░▀░▀▀▀░\n" +
                           "░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
        System.out.println("▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄\n" +
"████▌▄▌▄▐▐▌█████\n" +
"████▌▄▌▄▐▐▌▀████\n" +
"▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀");
    }
    
}
