package com.company;

import java.util.Scanner;

public class SumofN {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a;
        int b=0;


        System.out.println("How many numbers do you want to add?");
        a = scan.nextInt();
        for ( int i=0; i<a ;i++){
            System.out.println("Add the other number");
            b=b+scan.nextInt();
        }
        System.out.println("The sum is "+ b);
        scan.close();



    }
}