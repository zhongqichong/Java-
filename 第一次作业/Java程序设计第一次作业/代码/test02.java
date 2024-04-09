import java.util.Scanner;

public class test02 {
    public static void main(String[] args) {
        int n,t;//n:1-10    t:4-8
        char ch;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数n（1-10）：");
        n = scanner.nextInt();
        System.out.println("请输入一个整数t（4-8）：");
        t = scanner.nextInt();
        System.out.println("请输入一个字符ch：    ");
        ch= scanner.next().charAt(0);
        for(int i=1;i<=n;i++)
        {
            if(i<n)
                for(int j=0;j<n-i;j++)
                    System.out.print(" ");
            coutch(i,ch);
            if(i<=n)
                coutch(i-1,ch);
            System.out.println();
        }
        tree_trunk(n,t,ch);
    }

    public static void coutch(int i,char ch)
    {
        for(int j=0;j<i;j++)
            System.out.print(ch);
    }

    public static void tree_trunk(int n,int t,char ch)
    {
        for(int j=0;j<t;j++)
        {
            for(int i=0;i<n-1;i++)
            {
                System.out.print(" ");
            }
            System.out.println(ch);
        }
    }
}