import java.util.Scanner;
public class test113 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个正整数值：");
        int n=scan.nextInt();
        int ans=0;
        for(;n>0;){
            int x=n%10;
            ans=ans*10+x;
            n=n/10;
        }
        System.out.println(ans);
    }
}