package com.company;

import java.util.Scanner;

public class oddoreven {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = number.nextInt();
        if (num % 2 == 0) {
            if (num >= 20 && num <= 30)
                System.out.println("Jerry");
            else
                System.out.println("invalid input");
        } else
            System.out.println("Tom");

    }
}