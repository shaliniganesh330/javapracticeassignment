package com.company;

import java.util.Scanner;

public class sumofnumbers {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter the number");
//        hasNextInt checks for the next number
        while(scanner.hasNextInt())
        {
            System.out.println("Enter the number");
            sum = sum+ scanner.nextInt();

        }

        System.out.println(sum);
    }
}
