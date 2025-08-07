package shapeareacalculator;

class Triangle extends Shape {
    private double base, height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    double getArea() {
        return 0.5 * base * height;
    }

    void printType() {
        System.out.println("Shape: Triangle");
    }
}

