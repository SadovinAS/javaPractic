class Shape {
}
class Circle extends Shape {
    double radius;
    Circle(double r) {
        radius = r;
    }
}
class Square extends Shape {
    double width;
    Square(double w) {
        width = w;
    }
}

public class Main {
    public static void findFigType(Shape s){
        if (s instanceof Circle) {
            System.out.println("Круг");
        }
        else if (s instanceof Square) {
            System.out.println("Квадрат");
        }
        else{
            System.out.println("Это не фигура");
        }
    }

    public static void main(String[] args) {
        Shape shape1 = new Circle(5);
        Shape shape2 = null;
        findFigType(shape1); // Круг
        findFigType(shape2); // Это не фигура
    }
}