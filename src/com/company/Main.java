package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<Integer>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);
        System.out.println(myList.get(0));
        System.out.println(myList.get(1));
        myList.add(6,4);
        System.out.println(myList.get(4));
        System.out.println(myList.get(5));
        for (int i = 0; i < myList.getSize(); i++) {
            System.out.println(myList.get(i));
        }
        myList.remove(1);
        for (int i = 0; i < myList.getSize(); i++) {
            System.out.println(myList.get(i));
        }

    }
}
