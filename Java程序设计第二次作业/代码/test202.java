import java.util.Scanner;
public class test202 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入两个正整数：");
        int a=scan.nextInt();
        int b=scan.nextInt();
        System.out.println("最大公约数是：" + gcd(a,b));
    }
    public static int gcd(int a,int b){
        if(b>0||b<0)
            return gcd(b,a%b);
        else
            return a;
    }
}
