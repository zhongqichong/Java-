import java.util.Scanner;
public class test203 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入两个正整数：");
        int m=scan.nextInt();
        int n=scan.nextInt();
        System.out.println("Ack(" + m + "," + n +")=" + Ack(m,n));
    }
    public static int Ack(int m,int n){
        if(m==0)
            return n+1;
        else if(n==0)
            return Ack(m-1,1);
        else
            return Ack(m-1,Ack(m,n-1));
    }
}
