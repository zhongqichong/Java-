import java.util.Scanner;
public class test304 {
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        int a,b,c;
        System.out.print("输入: ");
        a=scan.nextInt();
        b=scan.nextInt();
        c=scan.nextInt();
        boolean m =true;
        for(int i=10;i<100;i++)
        {
            if(i%3==a && i%5==b && i%7==c) {
                m=false;
                System.out.println("输出：总人数（最小值）=" + i);
            }
        }
        if(m)
            System.out.println("输出： 无解");
    }
}
