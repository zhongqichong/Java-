import java.util.Scanner;

public class test201 {// 检查数值串是否为合法的k进制数
    public static boolean isValidBaseNumber(String number, int base) {
        for (char c : number.toCharArray()) {
            if (Character.digit(c, base) == -1) {
                return false;
            }
        }
        return true;
    }

    // 将k进制字符串转换为十进制整数
    public static int convertToDecimal(String number, int base) {
        int decimalValue = 0;
        int length = number.length();
        for (int i = 0; i < length; i++) {
            char digitChar = number.charAt(length - i - 1);
            int digit = Character.digit(digitChar, base);
            decimalValue += digit * Math.pow(base, i);
        }
        return decimalValue;
    }

    // 将十进制整数转换为m进制字符串
    public static String convertFromDecimal(int decimalNumber, int base) {
        if (decimalNumber == 0) {
            return "0";
        }

        StringBuilder baseNumber = new StringBuilder();
        while (decimalNumber > 0) {
            int remainder = decimalNumber % base;
            baseNumber.insert(0, Integer.toString(remainder, base));
            decimalNumber /= base;
        }
        return baseNumber.toString();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 输入原进制
        System.out.print("请输入原进制：");
        int originalBase = scan.nextInt();
        scan.nextLine();  // 消费换行符

        // 输入该进制的数值串
        System.out.print("该进制的数值串：");
        String originalNumber = scan.nextLine();

        // 验证数值串是否合法
        if (!isValidBaseNumber(originalNumber, originalBase)) {
            System.out.println(originalNumber + "是非法的" + originalBase + "进制数！");
            return;
        }

        // 输入目标进制
        System.out.print("请输入目标进制：");
        int targetBase = scan.nextInt();

        // 将原进制数转换为十进制数
        int decimalNumber = convertToDecimal(originalNumber, originalBase);

        // 将十进制数转换为目标进制数
        String targetNumber = convertFromDecimal(decimalNumber, targetBase);

        // 输出结果
        System.out.println(originalBase + "进制数" + originalNumber + "转换成" + targetBase + "进制结果是：" + targetNumber);
    }
}
