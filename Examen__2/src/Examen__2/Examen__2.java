/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Examen__2;
import java.util.*;
import java.util.concurrent.TimeUnit;
/**
 *
 * @author 123
 */
public class Examen__2 {

    /**
     * @param args the command line arguments
     */
    
        private static char randomChar() {
        int rand = new Random().nextInt(52);
        char start = (rand < 26) ? 'A' : 'a';
        return (char) (start + rand % 26);
    }
 
    public static void main(String[] args) throws InterruptedException {
        Scanner s=new Scanner(System.in);
        int clientes;
        System.out.println("Ingrese cuantos cliente tuvo");
        clientes = s.nextInt();
        for(int i=0;i<clientes;i++){
            long startTime = System.nanoTime();
            TimeUnit.SECONDS.sleep(6);
            long endTime = System.nanoTime();
            long timeElapsed = endTime - startTime;
            char c = randomChar();
            System.out.println("Ticket numero:"+i+"| Para la persona: "+c);
            System.out.println("El tiempo que se demoro fue: " + timeElapsed / 1000000+" segundo ");
            System.out.println("O El tiempo que se demoro fue: "+ timeElapsed / 1000000000+" minutos");
            }
    }
    }
    

