package com.Bridgelabz;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the sequence length: ");
        int n = sc.nextInt();

        int a = 0;
        int b = 1;

        System.out.println(a);
        System.out.println(b);

        for (int i = 0;i < n;i++) {

           int result = a + b;
           a = b;
           b = result;
            System.out.println(result);

        }
    }
}