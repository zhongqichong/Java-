import java.io.BufferedReader;
import java.io.FileReader;

public class test112 {
    public static void main(String[] args) throws Exception {
        String filePath = "e:/test.txt";
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String l;
        while ((l = reader.readLine()) != null) {
            System.out.println(l);
        }
    }
}
