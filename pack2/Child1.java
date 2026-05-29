package pack2;

import pack1.Class1;

public class Child1 extends Class1 {
    public static void main(String[] args) {
        Child1 obj = new Child1();

        System.out.println(obj.a); // получиться
        System.out.println(obj.b); // получиться
        // System.out.println(obj.c); Не получиться, так как с - default и не позволяет читать в другом пакете
        // System.out.println(obj.d); Не получиться так как d - private
    }
}