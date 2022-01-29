package com.Bridgelabz;

import java.util.Scanner;

public class NumReverse {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many coupon codes you need: ");
        int N=sc.nextInt();
        
        int Remainder = 1, Reverse = 0;
        
        while (N > 0) {
            
            Remainder = N % 10;
            N /= 10;
            Reverse = Reverse * 10 + Remainder;
        }
        
        System.out.println(Reverse);
    }
}