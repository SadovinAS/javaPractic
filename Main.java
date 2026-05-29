public class Main {
    public static void main(String[] args) {
        try {
            int[] arr = {1, 2, 3};
            int x = 10 / 0;
            System.out.println(arr[3]);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка");
        }
    }
}