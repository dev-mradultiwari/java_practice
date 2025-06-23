package com.company;

//Write a program ehich take name as a input from the user and greet them for sharing there name with us by using string methods

import java.util.Scanner;

public class CWH_15_practiceset3 {
    public static void main(String[] args) {
        String letter = "Dear <|name|>, Thanks a lot for sharing your name with us!>";

        System.out.println("Enter your name - ");

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        System.out.println(letter.replace("<|name|>", name));
    }
}
