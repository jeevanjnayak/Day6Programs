package com.Bridgelabz;

import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;

public class Coupon {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many coupon codes you need: ");
        int N=sc.nextInt();

        int[] arr = new int[N];
        int max = 100000, min = 999999;
        int index = 0,flag = 0;
        for(int i=0;index<N;i++)
        {
            int rand = (int) (Math.random() * (max - min + 1)) + min;
            for(int j=0;j<index;j++)
            {
                if(arr[j]==rand)
                {
                    flag=1;
                }
            }
            if(flag==0)
            {
                arr[index]=rand;
                index++;
            }
            flag=0;
        }
        System.out.println(Arrays.toString(arr));

    }
}