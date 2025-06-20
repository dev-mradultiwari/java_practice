package com.company;

import java.util.Scanner;

public class Excercise1_iii_CWH {
    public static void main(String[] args) {
        //Write a program to convert kilometers into miles
        System.out.println("Enter the no. of kilometers - ");
        Scanner sc = new Scanner(System.in);
        float km = sc.nextFloat();
        double miles = (double) km*0.621371;
        System.out.println(km + " kilometers in miles are " + miles + " miles");

    }
}
