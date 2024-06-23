import java.util.Scanner;

public class test203 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 输入一个字符串
        System.out.print("请输入一个字符串：");
        String input = scan.nextLine();

        // 使用正则表达式将非数字字符作为分隔符来拆分字符串
        String[] parts = input.split("\\D+");

        int sum = 0;

        // 遍历拆分后的字符串数组，将每个非空字符串解析为整数并求和
        for (String part : parts) {
            if (!part.isEmpty()) {
                sum += Integer.parseInt(part);
            }
        }

        // 输出结果
        System.out.println("和=" + sum);
    }
}
