/**
Write a program to accept three numbers n1 n2 and p from the user and find the even numbers between the 
n1 and n2 (including n1 and n2) now your task is to only print all the pth even number found between 
n1 and n2.

Example: n1 =2 n2=20 p=3
All even numbers between n1 and n2 are 2 4 6 8 10 12 14 16 18 20
Here p=3 so print every third even number from the sequence so output will be 6 12 18.
*/

import java.util.Scanner;

public class PrintPthEvenNumber {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two numbers : ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        System.out.print("Enter Pth value : ");
        int p = sc.nextInt();

        // creating two variables
        int smaller, larger;

        // checking smaller and larger
        if(n1 > n2) {
            larger = n1;
            smaller = n2;
        } else {
            larger = n2;
            smaller = n1;
        }

        int temp = 0;
        // printing Pth even number 
        while(smaller <= larger) {
            if(smaller%2 == 0) {
                temp++;
                if(temp == p) {
                    System.out.print(smaller + " ");
                    temp = 0;
                }
            }
            smaller++;
        }
    }
}