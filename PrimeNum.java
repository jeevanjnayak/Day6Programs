package com.Bridgelabz;

import java.util.Scanner;

public class PrimeNum {

    public static void main(String[] args) {

        int Sum=0, i=1;

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        long N=sc.nextLong();

        while(i <= N/2)
        {
            if(N % i == 0)
            {
                Sum++;
            }
            i++;
        }

        if(Sum > 1)

            System.out.println(N+" is not a prime number.");

        else
            System.out.println(N+" is a prime number.");
    }
}