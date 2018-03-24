package comp1110.homework.O04;

public class Square extends Shape {


    public Square(double length) {
        super(length);
    }

    public Square(double length, double x, double y) {
        super(length, x, y);
    }

    public double perimeter() {
        return length * 4;
    }

    public double area() {
        return length * length;
    }

    public boolean overlaps(Shape other) {
        double verticalright1 = x + length / 2;
        double verticalright2 = other.x + other.length / 2;
        double leveltop1 = y + length / 2;
        double leveltop2 = other.y + other.length / 2;
        if ((verticalright2 <= verticalright1 - length) || (verticalright2 >= verticalright1 + other.length) || (leveltop2 >= leveltop1 + other.length) || (leveltop2 <= leveltop1 - length)) {
            return false;
        }
        return true;
    }
}
