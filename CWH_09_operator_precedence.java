package com.company;

public class CWH_09_operator_precedence {
    public static void main(String[] args) {
        int a = 6*5-34/2;
        // 30-34/2
        //30-17
        //=13
        int b = 60/5-34*2;
        //evaluation will be done from left to right if the operators of same precedence being used

        System.out.println(a);
        System.out.println(b);
        //Precedence & associativity
        //Precedence tells us which operator will go first and associativity tells us the direction of execution of operators


    }
}
