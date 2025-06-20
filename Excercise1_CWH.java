package com.company;
//Write a program to convert the marks of 5 subjects into cgpa by taking input of all marks from user


import java.util.Scanner;

public class Excercise1_CWH {
    public static void main(String[] args) {
        System.out.println("Check your CGPA from your marks - ");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter maximum marks in subject 1 - ");
        int mm1 = sc.nextByte();
        System.out.println("Enter marks obtained in subject 1 - ");
        int mo1 = sc.nextByte();

        System.out.println("Enter maximum marks in subject 2 - ");
        int mm2 = sc.nextByte();
        System.out.println("Enter marks obtained in subject 2 - ");
        int mo2 = sc.nextByte();

        System.out.println("Enter maximum marks in subject 3 - ");
        int mm3 = sc.nextByte();
        System.out.println("Enter marks obtained in subject 3 - ");
        int mo3 = sc.nextByte();

        System.out.println("Enter maximum marks in subject 4 - ");
        int mm4 = sc.nextByte();
        System.out.println("Enter marks obtained in subject 4 - ");
        int mo4 = sc.nextByte();

        System.out.println("Enter maximum marks in subject 5 - ");
        int mm5 = sc.nextByte();
        System.out.println("Enter marks obtained in subject 5 - ");
        int mo5 = sc.nextByte();

        int a = mm1+mm2+mm3+mm4+mm5;

        int b = mo1+mo2+mo3+mo4+mo5;

        float c = (float) b/a;

        float cgpa = c*10;

        System.out.print("Your CGPA is : ");
        System.out.println(cgpa);

    }
}
