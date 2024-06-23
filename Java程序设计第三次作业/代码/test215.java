import java.util.Scanner;

public class test215 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 读取输入的行数
        System.out.print("请输入行数：");
        int n = scan.nextInt();
        scan.nextLine(); // 消耗换行符

        // 依次处理每行输入的字符串
        System.out.println("请输入字符串：");
        for (int i = 0; i < n; i++) {
            String input = scan.nextLine().trim();

            // 步骤一：将字符串按照每6个字符一组折叠
            String folded = foldString(input);

            // 步骤二：计算每一列字符的ASCII码之和
            int[] sums = calculateColumnSums(folded);

            // 步骤三：缩位处理得到6位密码
            String password = reduceToSixDigits(sums);

            // 输出结果
            System.out.println(password);
        }

        scan.close();
    }

    // 步骤一：折叠字符串为每6个字符一组
    private static String foldString(String input) {
        StringBuilder folded = new StringBuilder();

        int length = input.length();
        for (int i = 0; i < length; i++) {
            folded.append(input.charAt(i));
            if ((i + 1) % 6 == 0 && i != length - 1) {
                folded.append(" "); // 每6个字符后加空格
            }
        }

        return folded.toString();
    }

    // 步骤二：计算每一列字符的ASCII码之和
    private static int[] calculateColumnSums(String folded) {
        String[] parts = folded.split(" ");
        int columns = parts.length;
        int[] sums = new int[6]; // 因为题目要求是6位数字密码

        for (int i = 0; i < columns; i++) {
            String part = parts[i];
            for (int j = 0; j < part.length(); j++) {
                sums[j] += part.charAt(j); // 累加每一列的ASCII码值
            }
        }

        return sums;
    }

    // 步骤三：缩位处理得到6位密码
    private static String reduceToSixDigits(int[] sums) {
        StringBuilder password = new StringBuilder();

        for (int sum : sums) {
            int reduced = reduceToOneDigit(sum); // 缩位处理
            password.append(reduced);
        }

        return password.toString();
    }

    // 缩位处理，直到变成一位数字为止
    private static int reduceToOneDigit(int num) {
        while (num >= 10) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }
        return num;
    }
}
