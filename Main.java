
public class Main {
    public static void main(String[] args) {
        int i = 0;
        int sum = 0;
        while(true)
        {
            i = i + 1;
            if(i % 5 == 0)
                continue; // пропускает числа, делящиеся на 5
            sum = sum + i;
            if(i == 101)
                break;
        }
        System.out.println(sum);
    }
}