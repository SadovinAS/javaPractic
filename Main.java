public class Main {
    public static void main(String[] args) {
        java.util.StringJoiner joiner = new java.util.StringJoiner("->", "[", "]");
        joiner.add("A");
        joiner.add("B");
        joiner.add("C");
        System.out.println(joiner);
    }
}