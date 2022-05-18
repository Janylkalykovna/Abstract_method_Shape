package com.company;

public class Triangle extends Shape{
    public Triangle(double sideA, double sideB, double sideC) {
        super(sideA, sideB, sideC);
    }

    @Override
    public double getPerimeter() {
        double p=(getSideA()+getSideB()+getSideC());
        return p;
    }

}
