import java.util.Scanner;

public class test304 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入一个正整数： ");
        int number = scan.nextInt();
        scan.close();

        int result = countPartitions(number, number);
        System.out.println("整数" + number + "有" + result + "种加表示法");
    }

    public static int countPartitions(int n, int max) {
        if (n == 0) {
            return 1;  // 如果剩余的数为0，则只有一种表示法
        }
        if (n < 0) {
            return 0;  // 如果剩余的数为负，则没有表示法
        }

        int count = 0;
        for (int i = Math.min(max, n); i >= 1; i--) {
            count += countPartitions(n - i, i);  // 递归计算剩余数的表示法
        }

        return count;
    }
}
