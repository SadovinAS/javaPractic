package pack2;
import pack1.Class1;

public class Class3 {
    public static void main(String[] args) {
        Class1 obj = new Class1();

        System.out.println(obj.a); // получиться
        //System.out.println(obj.b); Не получиться, так как b - protected, а мы в другом пакете и не наследники
        // System.out.println(obj.c); Не получиться, так как с - default и не позволяет читать в другом пакете
        // System.out.println(obj.d); Не получиться так как d - private
    }
}
