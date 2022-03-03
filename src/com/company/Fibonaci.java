package com.company;

public class Fibonaci {
    public static void main(String[] args) {
        int maxNumber = 10;
        int previousNumber = 0;
        int nextNumber = 1;
        int sum;

        System.out.print("Fibonacci Series of " + maxNumber + " numbers:");

        for (int i = 1; i <= maxNumber; ++i) {
            System.out.print(previousNumber + " ");

            sum = previousNumber + nextNumber;
            previousNumber = nextNumber;
            nextNumber = sum;
        }
    }
}
