package com.Bridgelabz;

import java.util.Scanner;

public class PerfectNum {

    public static void main(String[] args) {

        long Sum=0, i=1;

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        long N=sc.nextLong();

        while(i <= N/2)
        {
            if(N % i == 0)
            {
                Sum = Sum + i;
            }
            i++;
        }

        if(Sum == N)
        {
            System.out.println(N+" is a perfect number.");
        }
        
        else
            System.out.println(N+" is not a perfect number.");
    }
}