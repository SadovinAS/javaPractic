class Sum{
    public static int sum(int a, int b){
        return a + b;
    }
    public static int sum(int... nums){
        int sum = 0;
        for(int n : nums){
            sum += n;
        }
        return sum;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(Sum.sum(5, 4));
        System.out.println(Sum.sum(5, 4, 3, 2, 1));
    }
}