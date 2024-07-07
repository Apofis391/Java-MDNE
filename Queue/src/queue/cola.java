/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package queue;

import java.util.Comparator;
import java.util.*;
/**
 *
 * @author 123
 */
public class cola {
    static class CustomIntegerComparator implements Comparator<Integer> {

        @Override
        public int compare(Integer o1, Integer o2) {
            return o1 < o2 ? 1 : -1;
        }
    }
    Queue<Integer> testIntegersPQ = new PriorityQueue<>(new CustomIntegerComparator());
    
}
