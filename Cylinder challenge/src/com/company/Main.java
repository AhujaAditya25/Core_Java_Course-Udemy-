package com.company;

public class Main {

    public static void main(String[] args) {
        Circle round = new Circle(2);
        System.out.println(round.getRadius());
        System.out.println(round.getArea());
        Cylinder newClyinder = new Cylinder(2,5);
        System.out.println(newClyinder.getVolume());
    }
}
