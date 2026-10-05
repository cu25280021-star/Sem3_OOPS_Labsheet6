// 7. Abstract Shape Area and Perimeter
abstract class Shape {
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Triangle extends Shape {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double calculateArea() {
        // Heron's Formula
        double s = (sideA + sideB + sideC) / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }

    @Override
    public double calculatePerimeter() {
        return sideA + sideB + sideC;
    }
}

public class AbstractShapeMain {
    public static void main(String[] args) {
        Shape circle = new Circle(5.0);
        Shape triangle = new Triangle(3.0, 4.0, 5.0);

        System.out.printf("Circle Area: %.2f | Perimeter: %.2f\n", circle.calculateArea(), circle.calculatePerimeter());
        System.out.printf("Triangle Area: %.2f | Perimeter: %.2f\n", triangle.calculateArea(), triangle.calculatePerimeter());
    }
}
