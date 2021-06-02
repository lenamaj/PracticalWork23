package com.alfa.work2;

public class Rectangle extends Shape {

    private double width;
    private double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return super.toString() +
                " width=" + width +
                ", height=" + height +
                ';';
    }

    @Override
    public double calcArea() {
        return height * width;
    }


}
