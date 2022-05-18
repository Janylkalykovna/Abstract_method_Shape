package com.company;
public class Rhombus extends Shape {
    private double sideI;

    public Rhombus(double sideI) {
        this.sideI = sideI;
    }

    public double getSideI() {
        return sideI;
    }

    public void setSideI(double sideI) {
        this.sideI = sideI;
    }

    public Rhombus(double sideA, double sideB, double sideC, double sideI) {
        super(sideA, sideB, sideC);
        this.sideI = sideI;

    }

    @Override
    public double getPerimeter() {
        double t;
        t=(getSideA()+getSideB()+getSideC()+getSideI());
        return t;
    }
}
