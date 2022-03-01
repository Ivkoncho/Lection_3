package com.company;

import java.util.Scanner;

public class Sum1toN {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N;
        int b=0;

        System.out.println("Enter any number");
        N = scan.nextInt();

        while (N>0);{
            b=b+N;
            N--;

        }
        System.out.println("The sum is "+ b);

    }
}