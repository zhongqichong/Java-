import java.util.Scanner;
public class test115 {
    public  static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入两个正整数：");
        int n,k;
        n=scan.nextInt();
        k=scan.nextInt();
        int count=0;
        while(n>0) {
            int num = n%10;
            count++;
            if(count==k)
            {
                System.out.println(num);
                break;
            }
            n=n/10;
        }
    }
}
