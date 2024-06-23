import java.util.Scanner;
public class test201 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个正整数：");
        int n = scan.nextInt();
        System.out.println("和="+ recur_sum(n));
    }

    public static int recur_sum(int n){
        if(n==0) return 0;
        else
            return n + recur_sum(n-1);
    }
}
