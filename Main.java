
public class Main {
    public static void main(String[] args) {
        byte b = 2;
        switch (b)
        {
            case 1:
                System.out.println("Byte = 1");
                break;
            case 2:
                System.out.println("Byte = 2");
                break;
        }

        char c = 'A';
        switch (c)
        {
            case 'A':
                System.out.println("Char = A");
                break;
            case 'B':
                System.out.println("Char = B");
                break;
        }

        int i = 5;
        switch (i) {
            case 0:
                System.out.println("Int = 0");
                break;
            case 5:
                System.out.println("Int = 5");
                break;
        }
    }
}