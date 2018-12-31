package com.company;

import java.util.Scanner;

public class vowelorconsonant {
    public static void main(String[] args) {
        String input;
        String string;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string");
        input = scanner.nextLine();

        string = input.toLowerCase();
        for (int i = 0; i < string.length(); i++)
        {
            char ch = string.charAt(i);
            /*condition for checking whether a letter is vowel*/
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            {
                System.out.println(ch + " " + "vowel");

            }
            /*condition for checking whether a letter is consonant*/
            else {
                System.out.println(ch + " " + "consonant");
            }
        }

    }
}

