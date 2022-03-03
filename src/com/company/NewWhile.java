package com.company;
import java.util.Scanner;
public class NewWhile {
    public static void main(String[] args) {
        int inputNumber=1;
        Scanner scan = new Scanner(System.in);


        while(inputNumber!=0){
    System.out.println("Please select an option\n" +
            "1)Option 1\n"+
            "2)Option 2\n"+
            "Else -end the program\n");
            inputNumber = scan.nextInt();
    switch(inputNumber){
        case 1:
            System.out.println("1");
            break;
        case 2:
            System.out.println("2");
            break;
        default:
            inputNumber = 0;
            System.out.println("Buy");
            scan.close();
    }




        }





    }


}
