package com.company;

public class CWH_10_increment_decrement_operators {
    public static void main(String[] args) {
        //Increment and decrement operators
        int i = 56;
        //int b = i++; first b is assigned i then i is incremented
        int j = 67;
        int c = j++; //first j is incremented then c is assigned j
        int k = j++ + 3;
        System.out.println("j" + j);
        int m = ++j + 3;
        System.out.println(i++);
        System.out.println(i);
        System.out.println(++i);
        System.out.println(i);
        System.out.println(k);
        System.out.println(m);
        System.out.println(j);
    }
}
