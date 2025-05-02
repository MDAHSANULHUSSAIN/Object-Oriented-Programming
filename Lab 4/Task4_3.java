/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ahsan.lav_4;

/**
 *
 * @author ASUS
 */

abstract class Shape {
    final String color; 
    static int shapeCount =0;
    Shape(String color) {
        this.color = color;
        shapeCount++; 
    }

    
    abstract double calculateArea();
    abstract double calculatePerimeter();
    static int getTotalShapes() {
        return shapeCount;
    }
}


class Circle extends Shape {
    double radius;
public Circle(String color, double radius) {
        super(color); 
        this.radius = radius;
    }

   
    @Override
    double calculateArea() {
        return Math.PI * radius*radius;
    }

    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
    void displayShapeInfo() {
        System.out.println("Circle (" + color + "): Area = " + String.format("%.2f", calculateArea()) +  ", Perimeter = " + String.format("%.2f", calculatePerimeter()));
    }
}

class Rectangle extends Shape {
    double length;
    double width;

    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

 
    @Override
    double calculateArea() {
        return length * width;
    }

    @Override
    double calculatePerimeter() {
        return 2 * (length + width);
    }

    void displayShapeInfo() {
        System.out.println("Rectangle (" + color + "): Area = " + String.format("%.2f", calculateArea()) + ", Perimeter = " + String.format("%.2f", calculatePerimeter()));
    }
}
public class Task4_3 {
    public static void main(String[] args) {
   
        Circle c = new Circle("Red", 5.0); 
        c.displayShapeInfo();

        Rectangle r= new Rectangle("Blue", 4.0, 5.0);
        r.displayShapeInfo();
        System.out.println("Total shapes created: " + Shape.getTotalShapes());
    }
}
