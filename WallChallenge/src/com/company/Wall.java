package com.company;

public class Wall {

    private double height;
    private  double width;

    public  Wall(double width,double height){
        if (width<0){
            width=0;
        }
        if (height<0){
            height=0;
        }
        this.height = height;
        this.width= width;
    }
    public  Wall(){
        this(0,0);
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public void setHeight(double height) {
        if (height<0){
            height=0;
        }
        this.height = height;
    }

    public void setWidth(double width) {
        if (width<0){
            width=0;
        }
        this.width = width;
    }

//    public double setArea(double height, double width){
//        this.height= height;
//        this.width=width;
//        double area = height*width;
//        return area;
//    }
    public double getArea(){
        double area;
        area = height*width;
        return area;
    }
}
