package com.company;

import java.util.Scanner;
import static java.lang.Character.*;

public class checkthechar {
    public static void main(String[] args) {
        char ch;
            Scanner scanner = new Scanner(System.in);
                System.out.println("Enter a string");
                     ch = scanner.next().charAt(0);
//   checking for uppercase
      if( isUpperCase(ch))
        System.out.println("Capital letter");
//        checking for lowercase
        else if( isLowerCase(ch))
          System.out.println("Small letter");
//        checking for digit
            else if( isDigit(ch))
          System.out.println("Digit");
                 else
//        Else print Special character
          System.out.println("Special character");
        }
}