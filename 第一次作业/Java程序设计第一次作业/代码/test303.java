import java.util.Scanner;
public class test303 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n;
        System.out.println("输入: ");
        n=scan.nextInt();
        int temp=1;
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            temp = (temp*i )% 1000000;
            sum=(sum+temp)%1000000;
        }

        System.out.println("输出: " + sum);
    }
}
