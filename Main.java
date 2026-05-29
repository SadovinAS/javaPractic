class MyFirstException extends Exception {
    public MyFirstException(String message) {
        super(message);
    }
}
public class Main {
    static double sqrt(double x) throws MyFirstException {
        if (x < 0) {
            throw new MyFirstException("Число меньше нуля");
        }
        return Math.sqrt(x);
    }
    public static void main(String[] args) {
        try {
            System.out.println(sqrt(-5));
        } catch (MyFirstException e) {
            System.out.println(e.getMessage());
        }
    }
}