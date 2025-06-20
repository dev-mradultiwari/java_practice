package com.company;

import java.util.Scanner;

public class CWH_05_takinginputs_part2 {
    public static void main(String[] args) {
        System.out.println("Taking inputs");

        Scanner mine2 = new Scanner(System.in);
        System.out.println("Enter number 1");
        float a = mine2.nextFloat();
        System.out.println("Enter number 2");
        float b = mine2.nextFloat();
        float sum = a+b;
        System.out.println("The sum of the numbers is");
        System.out.println(sum);


    }

}

//CWH_.05_takinginputs_part2