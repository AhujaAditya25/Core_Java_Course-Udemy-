package com.company;

public class Main {

    public static void main(String[] args) {

        VIPcoustomer Rajiv = new VIPcoustomer("Rajiv",1400,"Rajiv@123.com");
        Rajiv.checkCreditLimit(1400);
        System.out.println(Rajiv.getUsername());
        VIPcoustomer Adi = new VIPcoustomer();
        VIPcoustomer Udhav = new VIPcoustomer("Udhav",16000);
        Udhav.checkCreditLimit(1600);

    }
}
