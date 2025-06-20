package com.company;

public class CWH_05_operators {
    public static void main(String[] args) {
        int a = 4;
       // int b = 6 % a;  //Modulo operator - gives remainder

       int b = 9;
        b+=3; // assignment operator
        System.out.println(b);
        System.out.println(64<6);   //comparison operator
        System.out.println(64>5 && 64>8); // logical operator - && - until all conditions doesn't becomes true it will not show true means all conditions must be same
        System.out.println(64>5 || 64>100); // logical opertaor - || only one condition true than it will show true
    }
}
