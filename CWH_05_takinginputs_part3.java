package com.company;

import java.util.Scanner;

public class CWH_05_takinginputs_part3 {
    //code to check whether the number input by  user is an integer or not
    public static void main(String[] args) {
        System.out.println("Taking input from user :");
        Scanner mine3 = new Scanner(System.in);
                boolean b1 = mine3.hasNextInt();
        System.out.println(b1);
    }
}
