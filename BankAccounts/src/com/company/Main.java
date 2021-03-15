package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        BankATM newuser = new BankATM();
        double increbal=newuser.setincrementbalance(1000);
        double decrebal=newuser.setdecrementbalance(500);
        String name = "Aditya";
        String email = "abcd@123";
        System.out.println("Balance after deposite is : " +increbal);
        System.out.println("Balance after withdrawal is :" +decrebal);



    }
}
