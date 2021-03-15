package com.company;


public class VIPcoustomer {

    private String username;
    private int creaditLimit;
    private  String EmailAddress;

    public VIPcoustomer(String coustomername,int credit,String emailid){
        this.username = coustomername;
        this.creaditLimit = credit;
        this.EmailAddress = emailid;
        System.out.println("Name is set to : "+coustomername);
        System.out.println("Creadit Limit Entered is : "+credit);
        System.out.println("Email is set to : "+emailid);
    }
    public VIPcoustomer(){
        this("Aditya",15000,"myemail@aditya.com");
        System.out.println("You called a default constructor");
    }
    public VIPcoustomer(String coustomername, int creadit){
        this.username = coustomername;
        this.creaditLimit=creadit;
        this.EmailAddress = "myemail@aditya.com";
        System.out.println("You have called a constructor that has 2 Parameters," +
                "the email is set by default to : myemail@aditya.com");
        System.out.println("Name is set to : "+coustomername);
        System.out.println("Creadit Limit Entered is : "+creadit);
    }
    public void checkCreditLimit(int credLimit){
        if (creaditLimit>=credLimit){
            System.out.println("Credit Accepted");
        }
        else{
            System.out.println("Credit Limit is Excedded , Credit cannot be granted");
        }
    }
    public String getUsername(){
        return username;
    }

}
