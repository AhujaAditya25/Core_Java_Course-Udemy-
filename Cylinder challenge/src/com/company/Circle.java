package com.company;

public class Circle {
    private double radius;
    private double area;

    public Circle(double radius){
        if (radius<0) {
        radius=0;
        }
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        area= radius*radius*Math.PI;
        return area;
    }
}
