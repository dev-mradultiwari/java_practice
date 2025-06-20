package com.company;
import java.util.Scanner;

public class CWH_05_takinginputs {

    public static void main(String[] args) {

        System.out.println("Tking input from user");
        Scanner mine1 = new Scanner(System.in);

        System.out.println("Enter number 1");
        int a = mine1.nextByte();

        System.out.println("Enter number 2");
        int b = mine1.nextByte();

        int sum = a+b;
        
        System.out.println("The sum of these numbers are");
        System.out.println(sum);

    }

}
