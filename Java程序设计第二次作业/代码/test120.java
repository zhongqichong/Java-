import java.util.Scanner;

public class test120 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入多项式的阶数 n: ");
        int n = scan.nextInt();
        double[] coefficients = new double[n+1];
        System.out.println("请输入 " + (n+1) + " 个系数，从 a0 到 an:");
        for (int i = 0; i <= n; i++) {
            coefficients[i] = scan.nextDouble();
        }
        System.out.print("请输入 x 的值: ");
        double x = scan.nextDouble();
        double result = 0;
        for (int i = 0; i <= n; i++) {
            result += coefficients[i] * Math.pow(x, i);
        }

        // 输出结果
        System.out.println("多项式 P(x) 的值是: " + result);

        scan.close();
    }
}