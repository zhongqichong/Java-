import java.util.Scanner;
public class test109 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入两个正整数值：");
        int i,j;
        i=scan.nextInt();
        j=scan.nextInt();
        for(;i<=j;i++){
            if(PerfectNumber(i))
                System.out.print(i + " ");
        }
    }

    public static boolean PerfectNumber(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }
}
