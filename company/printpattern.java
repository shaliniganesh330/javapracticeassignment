package com.company;

import java.util.Scanner;

public class printpattern {
    public static void main(String[] args)
    {
        int i,j;
//        accepting the user input
        Scanner number = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = number.nextInt();
//        code to print the iteration
            for(i=1;i<=num;i++)
        {
            for(j=0;j<i;j++)
                System.out.print(i);

        }

    }
}
