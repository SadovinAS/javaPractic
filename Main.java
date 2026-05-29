class Animal {
    String name;
    Animal(String name) {
        this.name = name;
    }
    public void print() {
        System.out.println(name);
    }
}

class Dog extends Animal {
    Dog(String name) {
        super(name); // <- вызов конструктора
    }

    public void print2() {
        System.out.println("1 att " + super.name); // <- Вызов поля
        super.print(); // <- Вызов Метода
    }
}
public class Main {
    public static void main(String[] args) {
        Dog D = new Dog("bob");
        D.print2();
    }
}