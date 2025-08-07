package shapeareacalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of circle: ");
        double r = sc.nextDouble();
        Shape circle = new Circle(r);
        circle.printType();
        System.out.println("Area: " + circle.getArea());

        System.out.print("\nEnter length and width of rectangle: ");
        double l = sc.nextDouble();
        double w = sc.nextDouble();
        Shape rectangle = new Rectangle(l, w);
        rectangle.printType();
        System.out.println("Area: " + rectangle.getArea());

        System.out.print("\nEnter base and height of triangle: ");
        double b = sc.nextDouble();
        double h = sc.nextDouble();
        Shape triangle = new Triangle(b, h);
        triangle.printType();
        System.out.println("Area: " + triangle.getArea());

        sc.close();
    }
}

