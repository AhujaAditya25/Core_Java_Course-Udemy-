package com.company;

import java.util.Scanner;

public class Main {


    public static void printDayOfTheWeek(int day){
        switch (day){
            case 1 :
                System.out.println("It's the first day , Monday");
                break;
            case 2 :
                System.out.println("It's the second day , Tuesday");
                break;
            case 3 :
                System.out.println("It's the third day , Wednesday");
                break;
            case 4 :
                System.out.println("It's the fourth day , Thirsday");
                break;
            case 5 :
                System.out.println("It's the fifth day , Friday");
                break;
            case 6 :
                System.out.println("It's the sixth day , Saturday");
                break;
            case 7 :
                System.out.println("It's the final day of the week  , Sunday");
                break;
            default:
                System.out.println("Invalid Day entered enter days from 1-7 please.");
        }
    }







    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter a number from 1-7 to know what day of the week it is : ");
        int day = sc.nextInt();
        printDayOfTheWeek(day);
    }
}
