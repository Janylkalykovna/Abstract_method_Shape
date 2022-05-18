package com.company;

public class Main {

    public static void main(String[] args) {
	Triangle triangle= new Triangle(9, 3, 4);
        System.out.println("Triangle's perimetr is:"+ triangle.getPerimeter());

        Square square =new Square(11.3,11.3,11.3,11.3);
        System.out.println("Square's perimetr is:"+square.getPerimeter());

         Rhombus rhombus = new Rhombus(4.5, 8,4.5,8);
        System.out.println("Rhombus perimetr is:"+rhombus.getPerimeter());

        Rectangle rectangle= new Rectangle(4, 8,4);
        System.out.println("Reactangle square is:"+rectangle.getPerimeter());

        Circle circle= new Circle();
        System.out.println("Circle's perimetr is:"+circle.getPerimeter());


    }
}
