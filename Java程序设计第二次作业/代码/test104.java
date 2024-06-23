import java.util.Scanner;

public class test104 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int i,j,k;
        System.out.println("请输入三个正整数：");
        i=scan.nextInt();
        j=scan.nextInt();
        k=scan.nextInt();
        int f=0;
        for(;i<=j;)
        {
            if(is_prime(i))
            {
                System.out.print(i + " ");
                f++;
                if(f%k==0)
                    System.out.println();
            }
            i++;
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
