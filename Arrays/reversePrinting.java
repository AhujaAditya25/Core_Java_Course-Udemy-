package com.Arrays;

import java.util.Scanner;

public class reversePrinting {
//REVERSE PRINTING AN ARRAY//
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of an array you wish.");
        int arraysize= scanner.nextInt();
        int[] array = new int[arraysize];
        for (int i=0;i<arraysize;i++){
            System.out.println("Please enter element of the array.");
            array[i]=scanner.nextInt();
        }
        System.out.println("Array entered is : ");
        for (int value : array) {
            System.out.print(value+" ");

        }
        System.out.println();


        System.out.println("The reverse array is : ");
        for (int i = array.length-1;i>=0;i--){
            System.out.print(array[i] + " ");
//            System.out.println();
        }System.out.println();

    }
}
