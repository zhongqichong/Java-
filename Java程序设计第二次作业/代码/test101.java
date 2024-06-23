import java.util.Scanner;

public class test101 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("请输入三个正整数：");
        int i,j,k;
        i=scan.nextInt();
        k=scan.nextInt();
        j=scan.nextInt();
        int ans=i;
        System.out.print(i);
        for(int q=1;i+k<=j;q++)
        {
            i=i+k;
            ans+=i;
            System.out.print("+" + i);
        }
        System.out.print("=" + ans);
    }
}
