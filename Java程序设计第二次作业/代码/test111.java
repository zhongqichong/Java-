import java.util.Scanner;
public class test111 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个正整数值：");
        int n;
        n=scan.nextInt();
        int ans = 0;
        for (int i = 1; i <= n; i += 2) {
            ans += factorial(i);
        }
        System.out.println("s=" + ans);
    }

    public static int factorial(int num) {
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }
}