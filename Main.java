class A {
    public void print( int a ) {
        System.out.println(a);
    }
}
class B extends A {
    @Override
    public void printtt(int a) {
        System.out.println("B -> " + a);
    }
}
public class Main {
    public static void main(String[] args) {
        B b = new B();
        b.printtt(1);
    }
}