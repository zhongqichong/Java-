import java.util.Scanner;

public class test103 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个正整数：");
        int n;
        n=scan.nextInt();
        if(is_prime(n))
            System.out.println("是质数");
        else
            System.out.println("不是质数");
    }
    static boolean is_prime(int x) {
        boolean isprime =true;
        for(int i=2;i*i<=x;i++)
        {
            if(x%i==0)
                isprime =false;
        }
        return isprime;
    }
}
