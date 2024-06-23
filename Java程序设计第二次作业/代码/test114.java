import java.util.Scanner;
public class test114 {
    public  static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入两个正整数值：");
        int i,j;
        i=scan.nextInt();
        j=scan.nextInt();
        int x=0;
        for(;i<=j;i++)
        {
            if(Isomorphic_numbers(i)) {
                System.out.print(i + " ");
                x++;
                if (x % 10 == 0)
                    System.out.println();
            };
        }
    }

    public static boolean Isomorphic_numbers(int n){
        boolean result = false;
        int squre = n*n;
        int count=0;
        int x=n;
        while (x != 0) {
            x /= 10;
            count++;
        }
        if(squre%(int) Math.pow(10, count)==n)
            result = true;
        return result;
    }
}
