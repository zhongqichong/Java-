import java.util.Scanner;

public class test204 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 输入原始字符串
        System.out.print("请输入一个字符串：");
        String originalString = scan.nextLine();

        // 输入作为子串用的字符串
        System.out.print("请输入作为子串用的字符串：");
        String substring = scan.nextLine();

        // 使用正则表达式替换原始字符串中的子串为带方括号的形式
        String result = originalString.replaceAll(substring, "[" + substring + "]");

        // 输出结果
        System.out.println("结果是：" + result);
    }
}
