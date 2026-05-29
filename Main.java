import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("test.txt"));
        String line;
        while(sc.hasNext())
        {
            line = sc.next();
            System.out.println(line);
        }
        sc.close();
    }
}