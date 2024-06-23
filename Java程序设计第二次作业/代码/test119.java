import java.util.Scanner;

public class test119 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入数组的大小：");
        int n = scan.nextInt();
        int[] arr = new int[n];
        System.out.println("请输入" + n + "个整数：");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println("请输入步长：");
        int k;
        k=scan.nextInt();
        int i=-1;
        int count =0;
        do{
            i+=k;
            if(i>n-1)
                i=i-n;
            System.out.print(arr[i] + " ");
            count++;
        }while(i>=0&&count<=n-1);
    }
}
