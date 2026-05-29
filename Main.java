interface Shape {
    double area();
}
class Circle implements Shape {
    double radius;
    Circle(double r) {
        radius = r;
    }
    public double area() {
        return 3.14159265 * radius * radius;
    }
}
class Square implements Shape {
    double side;
    Square(double s) {
        side = s;
    }
    public double area() {
        return side * side;
    }
}
public class Main {
    public static void main(String[] args) {
        Shape shape1 = new Circle(5);
        Shape shape2 = new Square(4);
        var shapes = new Shape[]{shape1, shape2};
        for (var s : shapes) {
            System.out.println(s.area());
        }
    }
}