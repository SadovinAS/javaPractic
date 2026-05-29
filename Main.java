class Vector {
    double x;
    double y;
    Vector(double x, double y)
    {
        this.x = x;
        this.y = y;
    }
    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if(obj.getClass() != getClass())
            return false;
        if(this.x == ((Vector) obj).x && this.y == ((Vector) obj).y)
            return true;
        else
            return false;
    }
}
public class Main {
    public static void main(String[] args) {
        Vector a = new Vector(1, 5);
        Vector b = new Vector(1, 5);
        Vector c = new Vector(1, 4);
        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
    }
}