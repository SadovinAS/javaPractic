import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int i = (a == 1 ? 1 : (a == 2 ? 2 : 3));
        System.out.println(i);
    }
}