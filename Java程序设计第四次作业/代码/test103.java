import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Random;

public class test103 {
    public static void main(String[] args) throws Exception {
        DataOutputStream fout = new DataOutputStream(new FileOutputStream("d:/test.dat"));

        Random r = new Random();
        for (int i = 0; i < 100; i++) fout.writeInt(r.nextInt(100)+1);

        fout.flush();
        fout.close();

        DataInputStream fin = new DataInputStream(new FileInputStream("d:/test.dat"));

        int sum = 0;
        for (int i = 0; i < 100; i++) {
            int now = fin.readInt();
            System.out.print(now + " ");
            sum += now;
        }
        System.out.println();

        fin.close();
        double avg = (double) sum / 100;
        System.out.println("总和：" + sum);
        System.out.println("平均值：" + avg);
    }
}
