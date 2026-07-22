package com.training.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("John");
        list.add("Jhonny");
        list.add("Jnardhan");
        list.add("Amar");
        list.add("Akbar");
        list.add("Anthony");
        list.add("Gonsalves");
        list.add("Amar");
        list.add("Akbar");
        list.add(1510);
        list.add(null);
        list.add(15100.50);
        list.add(null);
        System.out.println(list);
        List<String> names= new ArrayList<String>();
        names.add("John");
        names.add("Jhonny");
        names.add("Amar");
        names.add("Akbar");
        names.add("Anthony");
        names.add("Gonsalves");
        names.add("Amar");
        System.out.println(names);
        for(String name:names){
            System.out.println(name);
        }
        System.out.println("*********Accessing list using index******");
        for(int index=0;index<list.size();index++){
            System.out.println(list.get(index));
        }
        System.out.println("*********Accessing list using iterator******");
        Iterator itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
