
public class Main {
    public static void main(String[] args) {
        String s = "Hello world";
        System.out.println(s.length()); // length() — длина строки
        System.out.println(s.equals("Hello world")); // equals() — сравнение строк
        System.out.println(s.toUpperCase()); // toUpperCase() — перевод в верхний регистр
        System.out.println(s.toLowerCase()); // toLowerCase() — перевод в нижний регистр
        System.out.println(s.contains("World")); // contains() — проверка наличия подстроки
        System.out.println(s.startsWith("Hello")); // startsWith() — проверка начала строки
        System.out.println(s.endsWith("world")); // endsWith() — проверка конца строки
        System.out.println(s.replace("world", "World")); // replace() — замена подстрок
        System.out.println(s.substring(0, 5)); // substring(a, b) — получение части строки
        System.out.println(s.charAt(1)); // charAt() — символ по номеру
    }
}