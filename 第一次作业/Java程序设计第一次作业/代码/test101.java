import java.util.Scanner;

public class test101 {
    public static void main(String[] args) {
        System.out.println("请输入一个正整数：");
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        if(n%2==0)
            System.out.println(1 + "+" + 3 + "+" + "..." + "+" +(n-1) +"=" +sumOfSeries(n));
        if(n%2!=0)
            System.out.println(1 + "+" + 3 + "+" + "..." + "+" + n +"=" +sumOfSeries(n));
    }

    public static int sumOfSeries(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i += 2) {
            sum += i;
        }
        return sum;
    }
}
