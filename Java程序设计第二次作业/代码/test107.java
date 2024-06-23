import java.util.Scanner;

public class test107 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个整数值：");
        int n;
        n=scan.nextInt();
        System.out.println("F"+n+"的值是：" +fibonacci(n));
    }
    public static int fibonacci(int n){

        if (n == 1 || n == 2)
            return 1;
        if (n > 2)
            return fibonacci(n - 1) + fibonacci(n - 2);
        return -1;
    }
}
