/**
Write a program to accept 2 numbers and a symbol in string format now according
to symbol perform the operation and display the result
Now ask user do you want to continue if user enters true continue the process and 
again accept two numbers and a symbol perform the operation and display the result
If user enters false terminate the process
*/

import java.util.Scanner;

public class MenuDriven {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);

        boolean flag = true;

        while(flag) {
            System.out.print("Enter two numbers : ");
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter a symbol : ");
            String symbol = sc.next();

            // performing operations according to symbol
            switch(symbol) {
                case "+" :
                        System.out.println("Sum is : " + (num1+num2));
                        break;
                case "-" :
                        System.out.println("Subtraction is : " + (num1-num2));
                        break;
                case "*" :
                        System.out.println("Multiplication is : " + (num1*num2));
                        break;
                case "/" :
                        System.out.println("Division is : " + (num1/num2));
                        break;
                default:
                        System.out.println("Enter Valid Symbol");
            }

            System.out.print("Do you want to continue, if yes enter - true otherwise false : ");
            flag = sc.nextBoolean();
        }
    }
}