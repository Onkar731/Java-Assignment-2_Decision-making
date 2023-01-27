/**
Write a program to accept two numbers n1 and n2 from the user and print all the prime number 
available between n1 and n2 in decreasing order.

Example: n1=10 n2=20, available prime numbers between the range is 19 17 13 11 (print in decreasing order)
*/

import java.util.Scanner;

public class PrintPrimeNumbers {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);

        // accepting input from the user
        System.out.print("Enter two numbers : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        // creating two variables
        int smaller, larger;

        // checking smaller and larger
        if(num1 > num2) {
            larger = num1;
            smaller = num2;
        } else {
            larger = num2;
            smaller = num1;
        }

        // printing prime numbers in decreasing order
        while(larger > smaller) {
            int i;
            for(i = 2; i < larger; i++) {
                if(larger%i == 0) {
                    break;
                }
            }
            if(i == larger) {
                System.out.print(larger + " ");
            }
            larger--;
        }

    }
}