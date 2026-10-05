// 3. Shape and Rectangle Area Override
class Shape {
    public double getArea() {
        return 0.0;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }
}

public class ShapeAreaMain {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Rectangle rect = new Rectangle(12.5, 4.0);

        System.out.println("Generic Shape Area: " + shape.getArea());
        System.out.println("Rectangle Area: " + rect.getArea());
    }
}
