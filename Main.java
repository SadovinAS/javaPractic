interface Math {
    default int add(int x, int y) {
        return x + y;
    }
    static int sub(int x, int y) {
        return x - y;
    }
}
class Calculator implements Math {
}
public class Main {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.add(5, 4)); // Обращение через Calculator c
        System.out.println(Math.sub(3, 2)); // Обращение через Интерфейс
    }
}