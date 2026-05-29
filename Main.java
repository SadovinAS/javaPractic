import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 1, 9, 3};
        System.out.println(Arrays.toString(numbers)); // --> [5, 2, 1, 9, 3]
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers)); // --> [1, 2, 3, 5 ,9]
        int[] numbers2 = {5, 2, 1, 9, 3};
        System.out.println(Arrays.equals(numbers, numbers2)); // -> false
        System.out.println(Arrays.compare(numbers, numbers2)); // -> 0
        System.out.println(Arrays.binarySearch(numbers, 3)); // -> 2
        System.out.println(Arrays.binarySearch(numbers, 10)); // -> -4
    }
}