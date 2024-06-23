import java.io.BufferedReader;
import java.io.FileReader;

public class test110 {
    public static void main(String[] args) throws Exception {
        String filePath = "e:/test.txt";
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        int character;
        while ((character = reader.read()) != -1) {
            System.out.print((char) character);
        }
    }
}
