import java.util.Scanner;

public class test301 {
    public static void main(String[] args){
        int a,b;
        Scanner scanner= new Scanner(System.in);
        System.out.println("请输入两个正整数：");
        a=scanner.nextInt();
        b=scanner.nextInt();
        int x;
        System.out.println("请选择哪一种方法：");
        x=scanner.nextInt();
        switch(x)
        {
            case 1:
                System.out.println(a +"和"+b+"的最大公约数是："+gcd1(a,b));
                break;
            case 2:
                System.out.println(a +"和"+b+"的最大公约数是："+gcd2(a,b));
                break;
        }

    }
    public static int gcd1(int a,int b){
        for(int i=0;;i++)
        {
            if(a>b)a=a-b;
            else if(a<b) b=b-a;
            else
                return a;
        }
    }

    public static int gcd2(int a,int b) {
        while(b!=0){
            if(b>a){
                int temp=a; a=b; b=temp;
            }
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}
