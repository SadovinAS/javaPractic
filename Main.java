class A {
    public void print( int a ) {
        System.out.println(a);
    }
    public void print( double a ) {
        System.out.println(a);
    }
    public void print( char a ) {
        System.out.println(a);
    }
}
public class Main {
    public static void main(String[] args) {
        A a = new A();
        a.print(1);
        a.print(2.0 / 3);
        a.print('f');
    }
}