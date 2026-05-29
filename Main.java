public class Main {
    public static void main(String[] args) {
        Integer T1 = Integer.decode("12"); // T1= 12
        Integer T2 = Integer.decode("-12"); // T2= -12
        Integer T3 = Integer.decode("012"); // T3= 10
        Integer T4 = Integer.decode("0x12"); // T4= 18
    }
}