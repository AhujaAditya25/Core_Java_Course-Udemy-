package com.company;

public class BankATM {
    private long accountnumber;
    private double balance = 1000;
    private String coustomername;
    private String email;
    private int phonenumber;

    public double setincrementbalance(int balance){
        double currentbalance = this.balance;
        currentbalance += balance;
        return currentbalance;

    }

    public double setdecrementbalance(int balance){
        double currentbalance =this.balance;
        if (currentbalance>balance) {
            currentbalance -= balance;
            return currentbalance;
        }
        else return -1;
    }


}
