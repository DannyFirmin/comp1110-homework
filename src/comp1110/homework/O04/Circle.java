package comp1110.homework.O04;

public class Circle extends Shape {

    public Circle(double length) {
        super(length);

    }

    public Circle(double length, double x, double y) {
        super(length, x, y);
    }

    public double perimeter() {
        return 2 * Math.PI * length;
    }

    public double area() {
        return Math.PI * length * length;
    }

    public boolean overlaps(Shape other) {

        double distance = Math.sqrt((Math.abs(other.x - x) * Math.abs(other.x - x) + Math.abs(other.y - y) * Math.abs(other.y - y)));
        return distance < other.length + length;

    }
}
