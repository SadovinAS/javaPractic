public class Main {
    public static void main(String[] args) {
        Object obj = "Hello";
        try {
            Integer x = (Integer) obj;
        } catch (ClassCastException e) {
            System.out.println("Неверное приведение типов");
        }
    }
}