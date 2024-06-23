import java.util.Scanner;

public class test202 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 输入字符串
        System.out.print("请输入字符串：");
        String input = scan.nextLine();

        // 使用正则表达式压缩重复字符
        String compressed = input.replaceAll("(.)\\1+", "$1");

        // 输出结果
        System.out.println("压缩结果是：" + compressed);
    }
}
