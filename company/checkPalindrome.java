package com.company;

import java.util.Scanner;

public class checkPalindrome {
    public static void main(String [] args){
        long number = palindrome();
        long number1 = number;
        long sum =0;
        while(number>0) {
            long num = number % 10;
            if (number % 2 == 0) {
                sum = sum + num;
            }
            number = number / 10;
        }

        if(sum < 25){
            System.out.println( number1 + "is palindrome and sum of even numbers is less than 25");

        }

        else
            System.out.println( number1 + "is not palindrome");

    }

    private static long palindrome() {

        long rem;
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the num");
        long num=scan.nextLong();
        long temp=num;
        long rev=0;

        while(num > 0)
        {
            rem = num % 10;
            rev = rev*10+rem;
            num /= 10;
        }
        System.out.println("the num is"+temp );

        return  temp;
    }
}
