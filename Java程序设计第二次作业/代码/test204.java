import java.util.Scanner;
public class test204 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个正整数：");
        int n=scan.nextInt();
        int ans=0;
        System.out.println(n + "的倒序是："+ reverse(n,ans));
    }

    public static int reverse(int n,int ans){
        if (n == 0)
            return ans;
        else
            return reverse(n / 10, ans * 10 + n % 10);
    }
}
