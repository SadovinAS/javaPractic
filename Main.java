import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
public class Main {
    public static void main(String[] args) throws IOException {
        byte[] data = {65, 66, 67};
        InputStream in = new ByteArrayInputStream(data);
        int x;
        while ((x = in.read()) != -1)
            System.out.println((char)x);
        in.close();
    }
}