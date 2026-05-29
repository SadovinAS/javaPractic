interface Math {
    double oper(double a, double b);

    class Add implements Math {
        @Override
        public double oper(double a, double b) {
            return a + b;
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Math adder = new Math.Add();

        System.out.println(adder.oper(5, 3));
    }
}