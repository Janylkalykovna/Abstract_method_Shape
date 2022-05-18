package com.company;

public class Square extends Shape{
    private double sideD;

    public Square(double sideD) {
        this.sideD = sideD;
    }

    public Square(double sideA, double sideB, double sideC, double sideD) {
        super(sideA, sideB, sideC);
        this.sideD = sideD;

    }

    public double getSideD() {
        return sideD;
    }

    public void setSideD(double sideD) {
        this.sideD = sideD;
    }

    @Override
    public double getPerimeter() {
        double p;
        p=(getSideA()+getSideB()+getSideC()+getSideD());
        return p;
    }
}
