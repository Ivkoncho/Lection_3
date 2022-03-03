package com.company;

import java.util.Scanner;

public class FindMinandMax {

    public static void main(String[] args) {
        // write your code here
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int n;
        Scanner s = new Scanner(System.in);
        System.out.print("How many entries do yu want to add? ");
        n =s.nextInt();
        for ( int i=0; i<n ;i++) {
            System.out.print("Enter a Value: ");
            int val = s.nextInt();
            if (val < min) {
                min = val;
            }
            if (val > max) {
                max = val;
            }
        }

        System.out.println("min: " + min);
        System.out.println("max: " + max);
    }



}

