import java.util.Scanner;

public class test105{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入两个正整数：");
        int n,k;
        n=scanner.nextInt();
        k=scanner.nextInt();
        Print_Prime(n,k);
    }
    public static void Print_Prime(int n,int k)
    {
        int count=0;
        for(int i=2;;i++)
        {
            if(Is_Prime(i)) {
                System.out.print(i + " ");
                count++;
                if(count%k==0)
                    System.out.println();
                if(count==n)
                    break;
            }
        }
    }
    public static boolean Is_Prime(int i)
    {
        boolean X=true;
        for(int j=2;j*j<=i;j++)
        {
            if(i%j==0)
                X=false;
        }
        return X;
    }
}