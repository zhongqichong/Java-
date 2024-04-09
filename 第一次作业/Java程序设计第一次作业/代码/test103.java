import java.util.Scanner;

public class test103{
    public static void main(String[] args){
        int i,k,j;
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入三个正整数：");
        i=scanner.nextInt();
        k=scanner.nextInt();
        j=scanner.nextInt();
        int temp=j-(j-i)%k;
        System.out.println(i+ "+" + (i+k) +"+" + "..." + "+" +temp+ "="+ Sum_Special(i,k,j));
    }

    public static int Sum_Special(int i,int k,int j)
    {
        int sum=0;
        for(;i<j;i+=k)
        {
            sum+=i;
        }
        return sum;
    }
}