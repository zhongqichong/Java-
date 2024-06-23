import java.util.Scanner;
public class test112 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个正整数值：");
        int n,ans=0;
        n=scan.nextInt();
        for(;n>0;){
            int x= n % 10;
            ans += x*x;
            n=n/10;
        }
        System.out.println(ans);
    }
}