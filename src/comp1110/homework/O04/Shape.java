package comp1110.homework.O04;

public abstract class Shape {
    double length;
    double x;
    double y;

    public Shape(double length) {
        this.length = length;
    }

    public Shape(double length, double x, double y) {
        this.length = length;
        this.x = x;
        this.y = y;
    }


    public abstract double perimeter();

    public abstract double area();

    public abstract boolean overlaps(Shape other);

    public static void main(String[] args) {
        Shape s1 = new Square(10);    // a square with sides of 10.0 units
        Shape s2 = new Circle(1.0);   // a circle of radius 1.0 units
        System.out.println(s1.perimeter());
        System.out.println(s1.area());
        System.out.println(s2.perimeter());
        System.out.println(s2.area());
    }
}
