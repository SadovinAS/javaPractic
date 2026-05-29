class A {
    public void print( int a ) {
        System.out.println(a);
    }
}
class B extends A {
    public void print(int a) {
        System.out.println("B -> " + a);
    }
}
public class Main {
    public static void main(String[] args) {
        B b = new B();
        b.print(1);
    }
}