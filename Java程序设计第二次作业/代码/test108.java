import java.util.Scanner;
public class test108 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入两个整数值：");
        int a,n;
        a=scan.nextInt();
        n=scan.nextInt();
        int ans=0;
        for(int i=1;i<=n;i++){
            ans+=reprat_number(a,i);
        }
        System.out.println(ans);
    }

    public static int reprat_number(int a,int n){
        int x=0;
        for(int i=0;i<n;i++){
            x=x*10+a;
        }
        return x;
    }
}
