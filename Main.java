import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
public class Main {
    public static void main(String[] args) throws IOException {
        OutputStream out = new FileOutputStream("out.txt");
        out.write(65);
        out.write(66);
        out.write(67);
        out.close();
    }
}