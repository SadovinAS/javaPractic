class Box<T> {
    T value;
    Box(T value) {
        this.value = value;
    }
}
public class Main {
    public static void main(String[] args) {
        Box<String> box = new Box<>("Hello");

        if (box instanceof Box<?>) {
            System.out.println("yes");
        }
    }
}