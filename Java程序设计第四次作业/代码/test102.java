import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class test102 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入内容：");
        String str = reader.readLine();
        FileOutputStream fout = new FileOutputStream("d:/test.dat");
        for (int i = 0; i < str.length(); i++) fout.write((byte) str.charAt(i));
        fout.close();
    }
}
