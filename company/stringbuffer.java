package com.company;

import java.util.Scanner;
import java.util.*;

public class stringbuffer {

        public static void main(String[] args)
        {
        String string;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to be reversed");
        string = scanner.nextLine();
        /*loop for printing the string in reverse order*/
        for (int i = (string.length()) - 1; i >= 0; i--)
        {
            System.out.print(string.charAt(i));
        }
        System.out.println();
        }
    }















