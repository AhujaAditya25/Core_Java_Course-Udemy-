package com.company;


import java.util.Scanner;

public class PlayList {

    public static void  main(String[] args) {
        boolean quit=false;
        do {
            System.out.println("Welcome, this is the first attempt to creating a playlist!");
            System.out.println("Enter an interger as per  the following");
            System.out.println("0: To add a song.\n" +
                    "1: To see all the songs that are there in the playlist.\n"+
                    "2: Quit");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            switch (choice) {
                case 0:
                    System.out.println("Please enter name of the song: ");
                    String name = scanner.next();
                    System.out.println("Enter duration of the song : ");
                    double duration = scanner.nextDouble();
                    Albums.addsongs(name, duration);
                    break;
                case 1:
                    Albums.printsongs();
                    break;
                case 2:
                    quit = true;
            }
        }
        while (quit!=true);
    }
}
