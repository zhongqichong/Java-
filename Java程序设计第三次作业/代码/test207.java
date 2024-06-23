import java.util.Scanner;

public class test207 {
    public static int minPeriod(String str) {
        int length = str.length();
        int res = length;
        for (int i = length / 2; i >= 1; i--) {
            if (length % i != 0)
                continue;
            int repeat = length / i;
            String sub = str.substring(0, i);
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < repeat; j++) {
                sb.append(sub);
            }
            if (sb.toString().equals(str)) {
                res = Math.min(res, i);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入一个字符串：");
        String str = scan.nextLine();
        int ans = minPeriod(str);
        System.out.printf("字符串：%s 的最小周期为：%d ", str, ans);
    }
}

