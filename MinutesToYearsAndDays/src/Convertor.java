import java.util.Scanner;

public class Convertor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter minutes : ");
        long minutes = sc.nextLong();
        printYearsAndDays(minutes);
    }
    public static void printYearsAndDays (long minutes){
        if (minutes<0){
            System.out.println("Invalid Value");
        }
        else {
            long hours = minutes / 60;
            long days = hours / 24;
            long years = days / 365;
            long remainingdays = days % 365;
            System.out.println(minutes + " min = " + years +" y and " +remainingdays+ " d");
        }
    }
}

