import java.util.Scanner;

public class test302 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入两个大数：");
        String num1 = scan.nextLine();
        String num2 = scan.nextLine();
        scan.close();

        String result = multiply(num1, num2);
        System.out.println("相乘结果是: " + result);
    }

    public static String multiply(String num1, String num2) {
        int len1 = num1.length();
        int len2 = num2.length();
        int[] result = new int[len1 + len2];

        // 逐位相乘
        for (int i = len1 - 1; i >= 0; i--) {
            for (int j = len2 - 1; j >= 0; j--) {
                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int sum = mul + result[i + j + 1];
                result[i + j + 1] = sum % 10;
                result[i + j] += sum / 10;
            }
        }

        // 将结果转换为字符串
        StringBuilder sb = new StringBuilder();
        for (int num : result) {
            if (!(sb.length() == 0 && num == 0)) {
                sb.append(num);
            }
        }

        return sb.length() == 0 ? "0" : sb.toString();
    }
}
