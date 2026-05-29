class Animal {
}

class Dog extends Animal {
}

class Box<T> {
    T value;
    Box(T value) {
        this.value = value;
    }
    T get() {
        return value;
    }
    void set(T value) {
        this.value = value;
    }
}

public class Main {
    public static void f1(Box<? extends Animal> box) {
        Animal a = box.get();
    }
    public static void f2(Box<? super Dog> box) {
        box.set(new Dog());
    }
    public static void main(String[] args) {
        Box<Dog> dogBox = new Box<>(new Dog());
        f1(dogBox);
        Box<Animal> animalBox = new Box<>(new Animal());
        f2(animalBox);
    }
}