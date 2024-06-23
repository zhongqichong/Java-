import java.util.Scanner;

public class test106 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入一个正整数n：");
        int n = scan.nextInt();
        double sum = 0.0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum -= 1.0 / i;
            } else {
                sum += 1.0 / i;
            }
        }
        System.out.print("和=" + sum);
    }
}
