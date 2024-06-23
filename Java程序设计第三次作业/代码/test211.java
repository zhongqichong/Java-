import java.util.Scanner;

public class test211 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("请输入一个串：");
        String input = scan.nextLine();

        String result = extractData(input);

        System.out.println("结果：" + result);

        scan.close();
    }

    private static String extractData(String input) {
        // 按照空格和制表符分割字符串
        String[] tokens = input.split("\\s+");

        StringBuilder result = new StringBuilder();

        // 遍历每个分割后的子字符串
        for (String token : tokens) {
            // 查找等号的位置
            int index = token.indexOf('=');

            if (index != -1) {
                // 提取等号后的部分
                String info = token.substring(index + 1);
                // 追加到结果字符串
                result.append(info).append(" ");
            }
        }

        // 去掉末尾多余的空格
        return result.toString().trim();
    }
}
