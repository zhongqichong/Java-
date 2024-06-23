import java.util.Scanner;

public class test102 {
    public static void main(String[] args){
        Scanner scan =new Scanner(System.in);
        System.out.println("请输入三个正整数值：");
        int i,j,k;
        i=scan.nextInt();
        j=scan.nextInt();
        k=scan.nextInt();
        int m=0;
        for(;i<=j;)
        {
            System.out.print(i + " ");
            i++;
            m++;
            if(m%k==0)
                System.out.println();
        }
    }
}
