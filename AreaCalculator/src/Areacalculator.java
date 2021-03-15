import java.util.Scanner;

public class Areacalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius for circle");
        double radius = sc.nextDouble();
        double AreaCircle = area(radius);
        System.out.println("Area of circle is : " + AreaCircle );
        System.out.println("Enter length for rectangle");
        double length = sc.nextDouble();
        System.out.println("Enter breadth for rectangle");
        double breadth = sc.nextDouble();
        double AreaRectangle = area(length,breadth);
        System.out.println("Area of Rectangle is : "+ AreaRectangle);
    }


    public static double area (double radius){
        if (radius<0){
            System.out.println("Invalid Value");
            return -1;
        }
        else{
           return radius * radius * Math.PI ;
        }
    }

    public static double area (double length, double breadth){
        if (length < 0 || breadth < 0){
            System.out.println("Invalid Value");
            return -1;
        }
        else {
            return length * breadth;
        }
    }


}
