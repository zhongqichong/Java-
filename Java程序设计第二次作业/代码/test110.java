import java.util.Scanner;
public class test110 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个正整数值：");
        int point;
        point = scan.nextInt();
        if(point>=90&&point<=100)
            System.out.println("*****");
        if(point>=80&&point<=89)
            System.out.println("****");
        if(point>=70&&point<=79)
            System.out.println("***");
        if(point>=60&&point<=69)
            System.out.println("**");
        if(point<=60)
            System.out.println("*");
    }
}
