/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package queue;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 *
 * @author 123
 */
public class x {

    /**
     * @param args the command line arguments
     */
   private static void testStringsNaturalOrdering() {
         Queue<String> testStringsPQ = new PriorityQueue<>();
        testStringsPQ.add("abcd");
        testStringsPQ.add("1234");
        testStringsPQ.add("23bc");
        testStringsPQ.add("zzxx");
        testStringsPQ.add("abxy");

        System.out.println("Strings Stored in Natural Ordering in a Priority Queuen");
        while (!testStringsPQ.isEmpty()) {
            System.out.println(testStringsPQ.poll());
    }
        
    }  
}
