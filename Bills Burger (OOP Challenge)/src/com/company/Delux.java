package com.company;

import java.util.Scanner;

public class Delux {
    private double initialamount= 200;
    private String breadroll;
    private String meat;
    private double fries = 50;
    private double extracheese = 20;
    private double extrapatty = 40;
    private double drink = 30;
    private int choice;
    Scanner decisioncoustomer = new Scanner(System.in);

    public Delux(){
        this.breadroll = "soft toasted";
        this.meat = "Chicken";
        getinfo();
        general();

    }
    public  void  getinfo(){
        System.out.println("Breadroll is of type: " +breadroll + " and the patty is : " +meat);

    }
    public void general() {
        System.out.println("The base price of the Delux basic burger is : "+initialamount+" rupees.");
        System.out.println("Would you like to add any add-on iteams?");
        System.out.println("You can add-on fries to go along with your burger" + "\n" + "Perhaps you can add a drink"
                + "\n" + "You can also add extra cheese or meat patty" + " please enter yes to add or no to continue");
        String decision = decisioncoustomer.next();
        if (decision.toLowerCase().equals("yes")) {
            addons();
        } else {
            System.out.println("You have selected to not opt for any add-ons");
            finalprocess();
        }
    }


    public void addons(){
        String decision ;
        do {

            System.out.println("What would you like to add ?");
            System.out.println("Select the following numbers for adding iteams: ");
            System.out.println("1.Fries");
            System.out.println("2.Drinks");
            System.out.println("3.Extra Cheese");
            System.out.println("4. Extra Patty");
            choice = decisioncoustomer.nextInt();
            switch (choice) {
                case 1:
                    this.initialamount += fries;
                    break;
                case 2:
                    this.initialamount += drink;
                    break;
                case 3:
                    this.initialamount += extracheese;
                    break;
                case 4:
                    this.initialamount += extrapatty;
                    break;
            }
            System.out.println("would you like to add anything else ?, type 'Yes' if if you do.");
            decision = decisioncoustomer.next();
        }
        while (decision.toLowerCase().equals("yes"));

        finalprocess();
    }

    public void  finalprocess(){
        System.out.println("The total amount to be paid is : " +initialamount);
    }
}
