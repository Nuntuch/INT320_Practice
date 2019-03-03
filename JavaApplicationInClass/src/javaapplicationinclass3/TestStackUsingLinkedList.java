/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplicationinclass3;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author INT303
 * @param <ObjG>
 */
public class TestStackUsingLinkedList<T> {

    public static void main(String[] args) {

        Object x = new String("ABCD");
        String y = new String("ABCD");
        ((String) x).charAt(0);
        Object z = y;
        ((String) z).charAt(0);

//        List st = new LinkedList();
//        LinkedList stack  = new LinkedList();
        List st = new LinkedList();
        LinkedList<Integer> stack = new LinkedList();
        for (int i = 0; i < 10; i++) {
//            stack.push(i);
//            stack.push(new Integer(i));
            stack.offer(new Integer(i));
        }
        System.out.println("Top -> " + stack.peek());
        while (!stack.isEmpty()) {

            System.out.println(stack.pop() * 10);
            System.out.println(stack.poll());

        }
        ///////////////////////////////

      
        
        
    }

    public void Test(T rex) {

    }

}
