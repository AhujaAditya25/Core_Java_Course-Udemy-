package com.company;

import java.util.Scanner;

public class Main {
    static Scanner s = new Scanner(System.in);

    private static int[] readIntegers(){
        System.out.println("Please enter the number of integers you want to input: \n");
        int a = s.nextInt();
        int[] inputarray = new int[a];
        System.out.println("Please proceed to input numbers. \n");
        for (int i =0; i<inputarray.length;i++){
            inputarray[i]= s.nextInt();
        }
        return inputarray;
    }

    private static int minfinder(int[] array){
        int temp= array[0];
        for (int i = 1; i<array.length;i++) {
            if (array[i]<temp){
                temp = array[i];
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        int[] array = readIntegers();
        int a=minfinder(array);
        System.out.println("The smallest number is : "+a);
    }
}
