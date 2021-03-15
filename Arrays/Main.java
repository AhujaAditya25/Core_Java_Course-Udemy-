package com.Arrays;

import java.util.Scanner;

public class Main {
    //ARRAYS CHALLENGE//

    public static int[] getIntegers(int value){
        Scanner scanner = new Scanner(System.in);

        int[] values = new int[value];
        for (int i = 0; i<value;i++){
            values[i]= scanner.nextInt();
        }

        return values;
    }

    public static void printArray(int[] values){
        for (int i = 0; i< values.length; i++){
            for (int j = i+1 ; j<values.length; j++){
                if (values[i]<values[j]){
                    int temp = values[i];
                    values[i]= values[j];
                    values[j]=temp;
                }
            }
        }

        for (int i = 0 ; i <values.length; i++){
            System.out.println("Element "+i+" contents "+values[i]);
        }
    }

    public static void main(String[] args) {
        int[] tempvalues= getIntegers(6);
        printArray(tempvalues);

    }
}
