import java.util.Scanner;

public class test104 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入三个正整数：");
        int i,j,k;
        i=scanner.nextInt();
        j=scanner.nextInt();
        k=scanner.nextInt();
        print_Prime(i,j,k);
    }

    public static void print_Prime(int i,int j,int k)
    {
        int count=0;
        for(;i<=j;i++)
        {
            if(Is_Prime(i))
            {
                System.out.print(i + " ");
                count++;
                if (count % 3 == 0)
                    System.out.println();
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