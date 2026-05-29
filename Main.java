interface A {
    default void print() {
        System.out.println("A");
    }
}
interface B {
    default void print() {
        System.out.println("B");
    }
}
class C implements A, B {
}
public class Main {
    public static void main(String[] args) {
        C t = new C();
        t.print();
    }
}