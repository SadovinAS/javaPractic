enum Operation {
    ADD {
        int oper(int a, int b) {
            return a + b;
        }
    },
    SUB {
        int oper(int a, int b) {
            return a - b;
        }
    };
    abstract int oper(int a, int b);
}
public class Main {
    public static void main(String[] args) {
        Operation op = Operation.ADD;
        System.out.println(op.oper(1, 4));
        op = Operation.SUB;
        System.out.println(op.oper(1, 4));
    }
}