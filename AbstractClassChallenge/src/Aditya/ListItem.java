package Aditya;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class ListItem {
     static Scanner scanner = new Scanner(System.in);
     static List<String> ListOfItems = new LinkedList<>();

    public static void AddItem(String item){
        if (ListOfItems.contains(item)){
            System.out.println("The list already contains the mentioned item\n" +
                    "Do you want to add the item anyway?(YES/NO)");
            String ans = scanner.next();
            if (ans.toLowerCase().equals("yes")){
                ListOfItems.add(item);
                System.out.println("Item added successfully");
            }
            return;
        }
        else ListOfItems.add(item);
        System.out.println("Item added successfully");
    }
    public static void PrintItem(){
        if (ListOfItems.isEmpty()){
            System.out.println("The list is empty.");
        }
        for (int i =0; i<ListOfItems.size();i++){
            System.out.println(i+" is : "+ListOfItems.get(i));
        }
    }

    public static String ListItemNext(int i){
        System.out.println("Checking if the index mentioned has a next item added to follow.");
        ListIterator<String>iterator = ListOfItems.listIterator(i);
        if (iterator.hasNext()){
            System.out.println("The list has a next item, that follows the current item. ");
            return iterator.next();
        }
        System.out.println("There's no next item in this list.");
        return null;
    }
    public static String ListItemPrevious(int i){
        System.out.println("Checking to see if there's a previous item...");
        ListIterator<String>listIterator = ListOfItems.listIterator(i);
        if (listIterator.hasPrevious()){
            System.out.println("Previous item found.");
            return listIterator.previous();
        }
        System.out.println("There's no previous item..");
        return null;
    }

    public static void main(String[] args) {
        boolean answer = false;
        do {
            System.out.println("Welcome to the implementation of list.");
            System.out.println("We have the following functions:");
            System.out.println("1.Add Item to the list.");
            System.out.println("2.Check previous item.");
            System.out.println("3.Check next item.");
            System.out.println("4.To print all the items in the list.");
            System.out.println("5.To Quit.");
            System.out.println("Please enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Please Enter item name : ");
                    String item = scanner.next();
                    AddItem(item);
                    break;
                case 2:
                    System.out.println("Please enter the value for which the previous value is to be found out: ");
                    int i = scanner.nextInt();
                    String answ = ListItemPrevious(i);
                    System.out.println(answ + " is the previous entry in the list.");
                    break;
                case 3:
                    System.out.println("Please enter the value for which the next value is to be found out: ");
                    int j = scanner.nextInt();
                    String prev = ListItemNext(j);
                    System.out.println(prev + " is the next entry in the list.");
                    break;
                case 4:
                    PrintItem();
                    break;
                case 5:
                    answer = true;
            }
        }
        while (!answer);
    }



}
