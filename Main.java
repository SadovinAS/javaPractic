class Sum{
    int sum(int a, int b) {
        return a + b;
    }
    int sum(int a, int b, int c) {
        return a + b + c;
    }
}
class StrangeSum extends Sum{
    @Override
    int sum(int a, int b) {
        return a - b;
    }
}

public class Main {
    public static void main(String[] args) {
        Sum calc = new Sum();
        StrangeSum calc2 = new StrangeSum();
        System.out.println(calc.sum(2, 3));        // -> 5
        System.out.println(calc.sum(2, 3, 4));     // -> 9
        System.out.println(calc2.sum(3, 2));     // -> 1
    }
}