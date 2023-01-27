/**
Write a program to accept two numbers where n1>n2 or n2>n1 both allowed but n1==n2 not allowed your task
is to find all the numbers between n1 and n2 (including n1 and n2) that are divisible by 3 and 5 both 
numbers and output should be get printed in increasing order of numbers.

Example: n1=30, n2=10 numbers between n1 and n2 that are divisible by
3 and 5 both are 15 and 30 only so print 15 30 in output (in increasing order).
*/

import java.util.Scanner;

public class PrintNumbersDivisibleBy3And5 {
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

        // printing all numbers which are divisible by 3 and 5 both
        while(smaller <= larger) {
            if(smaller%3 == 0 && smaller%5 == 0) {
                System.out.print(smaller + " ");
            }

            smaller++;
        }
    }
}