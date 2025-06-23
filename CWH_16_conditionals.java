package com.company;

import java.util.Scanner;

public class CWH_16_conditionals {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age : ");
        int age = sc.nextInt();

        if(age>18){
            System.out.println("Yes, you can drive");
        }
        else {
            System.out.println("You cannot drive");
        }


    }
}
