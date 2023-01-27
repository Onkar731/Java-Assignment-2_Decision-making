/**
Write a program to accept n where 1<=n<=4 digit number and check whether it is Armstrong number or not.
*/

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");

        // accepting a input from the user
        int num = sc.nextInt();
        // creating a temp variable
        int temp = num;
        
        int digits = 0;
        while(temp != 0) {
            temp /= 10;
            digits++;
        }

        temp = num;
        int arm = 0;
        while(temp != 0) {
            arm += (int)Math.pow(temp%10, digits);
            temp /= 10;
        }

        // checking whether it is armstrong or not
        if(num == arm) {
            System.out.println(num + " is a Armstrong number");
        } else {
            System.out.println(num + " is not a Armstrong number");
        }
    }
}