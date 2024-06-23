import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class test111 {
    public static void main(String[] args) throws Exception {
        String filePath = "e:/test.txt";
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), StandardCharsets.UTF_8));
        int character;
        while ((character = reader.read()) != -1) {
            System.out.print((char) character);
        }
    }
}
