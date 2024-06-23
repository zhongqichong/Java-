import java.util.Scanner;

public class test105 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入两个正整数值：");
        int n,k;
        n=scan.nextInt();
        k=scan.nextInt();
        int f=0;
        for(int i=2;;i++)
        {
            if(is_prime(i))
            {
                System.out.print(i + " ");
                f++;
                if(f%k==0)
                    System.out.println();
            }
            if(f==n)
                break;
        }
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
