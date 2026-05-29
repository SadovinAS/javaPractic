import java.util.Date;
public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.printf("%tH%n", date); // часы
        System.out.printf("%tM%n", date); // минуты
        System.out.printf("%tS%n", date); // секунды
        System.out.printf("%tY%n", date); // год
        System.out.printf("%tB%n", date); // месяц
    }
}