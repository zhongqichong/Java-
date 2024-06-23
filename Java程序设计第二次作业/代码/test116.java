import java.util.Scanner;
public class test116 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个正整数：");
        int n;
        n=scan.nextInt();
        int lnum=n;
        int rnum=n;
        while(true){
            if(isPrime(n)) {
                System.out.println("最接近的素数是：" + n);
                break;
            };
            if(isPrime(lnum)&&isPrime(rnum)){
                  System.out.println("最接近的素数是：" + lnum +"和" + rnum);
                  break;
            };
            if(isPrime(lnum)) {
                System.out.println("最接近的素数是：" + lnum);
                break;
            };
            if(isPrime(rnum)) {
                System.out.println("最接近的素数是：" + rnum);
                break;
            }    ;
            lnum--;
            rnum++;
        }
    }
    public static boolean isPrime(int num) {
        if (num <= 1)
            return false;
        for (int i = 2; i*i <= num; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}
