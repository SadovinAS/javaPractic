public class Main {
    public static void main(String[] args) {
        try {
            String A = String.format("%d", "hello");
        } catch (IllegalArgumentException e) {
            System.out.println("Неверный Формат");
        }
    }
}