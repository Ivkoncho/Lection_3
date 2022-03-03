package com.company;

import java.util.Scanner;

public class Sum1toN {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        int sum=0;

        System.out.println("Enter any number");
        num = scan.nextInt();

        for(int i = 1; i <= num; ++i)
        {
            // sum = sum + i;
            sum += i;
        }

        System.out.println("Sum = " + sum);
    }

    }
