abstract class Figure {
    public abstract double getVolume();
}
class Sphere extends Figure {
    private double R;
    public Sphere(double rad) {
        this.R = rad;
    }
    @Override
    public double getVolume() {
        return 4.0 / 3 * 3.14159365 * R * R * R;
    }
}
class Cube extends Figure {
    private double A;
    public Cube(double len) {
        this.A = len;
    }
    @Override
    public double getVolume() {
        return A * A * A;
    }
}
public class Main {
    public static void main(String[] args) {
        Figure f1 = new Sphere(2.5);
        Figure f2 = new Cube(5);

        System.out.println(f1.getVolume());
        System.out.println(f2.getVolume());
    }
}