package pack1;

public class Class2 {
    public static void main(String[] args) {
        Class1 obj = new Class1();

        System.out.println(obj.a); // Получиться
        System.out.println(obj.b); // получиться
        System.out.println(obj.c); // Получиться
        // System.out.println(obj.d); Не получиться, так как d - private
    }
}
