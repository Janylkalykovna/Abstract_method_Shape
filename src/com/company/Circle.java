package com.company;

public class Circle extends Shape{
    private  double r;
    private  double d=5;
    @Override
    public double getPerimeter() {
        //L=r*d; Тегеректин периметрин ушул формула менен чыгарабыз
        double r=3.14;
        double l=(r*d);
        return l;
    }
}
