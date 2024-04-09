import java.util.Scanner;

public class test106 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int n;
        System.out.println("请输入一个正整数：");
        n=scanner.nextInt();
        double X=Print_math(n);
        System.out.print("和" + "=" +X);
    }

    public static double Print_math(int n){
        double end=0;
        for(int i=1;i<=n;i++)
        {
            if(i%2==0)
                end-=1.0/i;
            else
                end+=1.0/i;
        }
        return end;
    }
}