package com.company;

public class Rectangle extends Shape{
    public Rectangle() {
    }

    public Rectangle(double sideA, double sideB, double sideC) {
        super(sideA, sideB, sideC);
    }

    @Override
    public double getPerimeter() {
        double s;
        s=(getSideA()*getSideB())+(getSideC()*0);
        return s;
    }
}
