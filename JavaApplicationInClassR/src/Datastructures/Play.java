/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datastructures;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Stack;

/**
 *
 * @author Nuntuch Thongyoo
 */
public class Play {

    public static void main(String[] args) {
//        List myList = new LinkedList();
//        myList.add("555");
//        myList.add("Hi");
//        myList.add("EiEi");
//        myList.add("555+");
//        myList.add("Hello");
//        myList.add("World");
//        myList.add("Get A");
//        ListIterator itr = myList.listIterator();
//        while(itr.hasNext()){
//            System.out.println("itr : "+ itr.next());
//        
//        
//        }
////        System.out.println(itr.next() + " " + itr.next() + " " + itr.previous()
////        );
//        
//        Map<Integer,String> mapploy = new HashMap<>(17,0.5f);
//        
//        mapploy.put(117,"Ploy" );
//        mapploy.put(117,"Dr.Ploy" );
//        
//    
//        
//        for (String object : mapploy.values()) {
//            System.out.println("Obj :" + object.toString());
//        }
//        
        
            Stack sta = new Stack();
            sta.add("1");
            sta.push("2");
            sta.push("3");
            
            Iterator itr = sta.iterator();
            
            while (itr.hasNext()){
                System.out.println(itr.next());
            
            
            }

    }
}
