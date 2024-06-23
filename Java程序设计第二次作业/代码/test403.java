import java.util.Scanner;

public class test403 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入两个整数：");
        int n = scan.nextInt();
        int m = scan.nextInt();
        System.out.print("再请输入" + n + "个整数：");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        int[] b = new int[m];
        int ptr = 0;
        int sec = 0;

        while (true) {
            sec++;
            boolean allZeros = true;

            for (int i = 0; i < m; i++) {
                if (b[i] == 0) {
                    if (ptr < n) {
                        b[i] = a[ptr++];
                    }
                }
                if (b[i] > 0) {
                    b[i]--;
                    if (b[i] > 0) {
                        allZeros = false;
                    }
                }
            }

            if (ptr == n) {
                boolean bEmpty = true;
                for (int value : b) {
                    if (value != 0) {
                        bEmpty = false;
                        break;
                    }
                }
                if (bEmpty) {
                    break;
                }
            }
        }
        System.out.println(sec);
    }
}
