class Outer {
    private int privateField = 1;
    int defaultField = 2;
    protected int protectedField = 3;
    public int publicField = 4;

    private void privateMethod() {
        System.out.println("privateMethod");
    }
    void defaultMethod() {
        System.out.println("defaultMethod");
    }
    protected void protectedMethod() {
        System.out.println("protectedMethod");
    }
    public void publicMethod() {
        System.out.println("publicMethod");
    }

    class Inner {
        void accessOuter() {
            System.out.println(privateField);   // доступно
            System.out.println(defaultField);   // доступно
            System.out.println(protectedField); // доступно
            System.out.println(publicField);    // доступно

            privateMethod();    // доступно
            defaultMethod();    // доступно
            protectedMethod();  // доступно
            publicMethod();     // доступно
        }
    }
}
public class Main {
    public static void main(String[] args) {
    }
}