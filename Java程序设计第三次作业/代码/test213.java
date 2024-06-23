import java.util.Scanner;

public class test213 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 提示用户输入字符串
        System.out.print("请输入一个字符串：");
        String input = scan.nextLine();

        // 调用方法进行压缩编码
        String result = compressString(input);

        // 输出结果
        System.out.println("压缩后的结果是：" + result);

        scan.close();
    }

    // 压缩字符串
    private static String compressString(String str) {
        StringBuilder compressed = new StringBuilder();

        int count = 1;
        for (int i = 1; i <= str.length(); i++) {
            if (i < str.length() && str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                compressed.append(str.charAt(i - 1));
                if (count > 1) {
                    compressed.append(count);
                }
                count = 1;
            }
        }

        return compressed.toString();
    }
}
