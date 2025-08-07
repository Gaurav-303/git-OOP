package shapeareacalculator;

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    double getArea() {
        return Math.PI * radius * radius;
    }

    void printType() {
        System.out.println("Shape: Circle");
    }
}

