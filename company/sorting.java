package com.company;

import java.util.Scanner;

public class sorting {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int input = scanner.nextInt();
        int [] arr = new int[20];
        int s,i;
        /*putting the integer into the array*/
        for(i = 0;input > 0;input = input/10,i++)
        {
            s =input % 10;
            arr[i]=s;
        }
        /*sorting the digits in non increasing order*/
        for(int k=0;k<i-1;k++)
        {
            for(int j=0;j<i-k-1;j++)
            {
                if(arr[j]<arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int k=0;k<i;k++){
            System.out.print(arr[k]); //printing the sorted string
        }

        System.out.println();
        int sum=0;
        for(int k=0;k<i;k++) {
            if(arr[k]%2==0)            //summing the even numbers
                sum+=arr[k];
        }
        System.out.println("Sum of even numbers : "+ " "+sum);
            if(sum>15) {                 /*If sum is greater than 15*/
            System.out.println("True");
                       }
        else {                      /*If sum is less than 15*/
            System.out.println("False");
            }

    }
}



