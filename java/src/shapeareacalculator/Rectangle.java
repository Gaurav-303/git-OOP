package shapeareacalculator;
class Rectangle extends Shape {
    private double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double getArea() {
        return length * width;
    }

    void printType() {
        System.out.println("Shape: Rectangle");
    }
}
