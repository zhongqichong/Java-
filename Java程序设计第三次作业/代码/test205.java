import java.util.Scanner;

public class test205 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 输入一个字符串
        System.out.print("请输入一个字符串：");
        String input = scan.nextLine();

        // 使用 StringBuilder 反转字符串
        StringBuilder reversed = new StringBuilder(input).reverse();

        // 输出结果
        System.out.println("结果是：" + reversed);
    }
}
