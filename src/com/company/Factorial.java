package com.company;
import java.util.Scanner;
public class Factorial {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a;
        System.out.println("Add factrotial number:");
        a = scan.nextInt();
        long factorial = 1;
        for(int i = 1; i <= a; ++i)
        {
            // factorial = factorial * i;
            factorial *= i;
        }
        System.out.print("Factorial is "+ factorial);
    }

}
