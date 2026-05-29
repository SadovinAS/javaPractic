class My implements AutoCloseable {
    public void hello() {
        System.out.println("Работа");
    }
    @Override
    public void close() {
        System.out.println("Закрытие");
    }
}
public class Main {
    public static void main(String[] args) {
        try (My r = new My()) {
            r.hello();
        }
    }
}