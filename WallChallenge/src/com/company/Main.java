package com.company;

public class Main {

    public static void main(String[] args) {
        Wall wall = new Wall(-10.0,-10.5);
        System.out.println(wall.getHeight());
        System.out.println(wall.getWidth());
        System.out.println(wall.getArea());
    }
}
