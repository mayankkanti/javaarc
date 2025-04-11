package Assignments.SecondSemester.Assignment2;

//Create an abstract class Shape and the derived classes Square, Triangle and Circle. Write a java program to
//display area of different shapes


abstract class Shape {
    double area;
    abstract double area();
}
class Square extends Shape {
    double side;

    Square(double side) {
        this.side = side;
        area = area();
    }
    double area() {
        return side * side;
    }
}

class Triangle extends Shape {
    double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
        area = area();
    }
    double area() {
        return 0.5 * base * height;
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
        area = area();
    }
    double area() {
        return Math.PI * radius * radius;
    }
}

public class Q5 {
    public static void main(String[] args) {
        Square square = new Square(5);
        System.out.println("Area of Square: " + square.area);

        Triangle triangle = new Triangle(4, 5);
        System.out.println("Area of Triangle: " + triangle.area);

        Circle circle = new Circle(3);
        System.out.println("Area of Circle: " + circle.area);
    }
}
