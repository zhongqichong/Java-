import java.util.Scanner;

public class test102{
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        System.out.println("请输入两个正整数：");
        int i,j;
        i=scanner.nextInt();
        j=scanner.nextInt();
        System.out.println(i + "+" + (i+1) + "+" +"..." + "+" + j + "=" + total_sum(i,j));
    }

    public static int total_sum(int i,int j)
    {
        int sum=0;
        for(;i<=j;i++)
        {
            sum+=i;
        }
        return sum;
    }
}