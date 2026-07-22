package com.training.collections;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        Collection c=new ArrayList();
        System.out.println(c.isEmpty());
        c.add("a");
        c.add("b");
        c.add("c");
        c.add("d");
        c.add("f");
        c.add("g");
        c.add("h");
        System.out.println(c.size());
        System.out.println(c.contains("c"));
        System.out.println(c.contains("e"));
        c.remove("c");
        for(Object o:c){
            System.out.println(o);
        }
        System.out.println("******************");
        Iterator itr = c.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        LinkedList ll=new LinkedList();
        ll.add("a");
        ll.add("b");
        Vector v=new Vector();
        v.add("c");
        v.add("d");

    }
}
