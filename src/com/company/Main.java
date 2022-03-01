package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int a=0;
        int N;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number");
        N = scan.nextInt();
        scan.close();
        while(a<=N) {
        System.out.println("Next number " + a++);


        }




    }
}
