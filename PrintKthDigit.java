/**
Write a program to find the kth digit of a accepted numbers. So accept two numbers n and k where k 
denotes place of digit that has to display.
Example n=56789 and k-2 so from right to left 8 is the second digit so print 8 in output.

If k is greater than number of digits available in n print message kth digit not found.
Example: n=56789 n=10 so print message 10th digit not found.
*/

import java.util.Scanner;

public class PrintKthDigit {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);

        // accepting input from the user
        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        System.out.print("Enter Kth digit : ");
        int k = sc.nextInt();
        int temp = k;
        // printing kth digit from the number
        while(num != 0) {
            if(temp == 1) {
                System.out.println(num%10);
                break;
            }
            num /= 10;
            temp--;
        }

        if(num == 0) {
            System.out.println(k + "th digit not found");
        }

    }
}