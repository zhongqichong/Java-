import java.util.Scanner;
public class test306 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n;
        System.out.print("输入：");
        n=scan.nextInt();
        int i;
        for (i = 1; n - i > 0; i++) {
            n -= i;
        }
        if (i % 2 == 0) {
            System.out.printf("%d/%d", n, i + 1 - n);
        } else {
            System.out.printf("%d/%d", i + 1 - n, n);
        }
    }
}
