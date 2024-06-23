import java.util.Scanner;

public class test123 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入一个字符串：");
        String input = scan.nextLine();

        if (isPalindrome(input)) {
            System.out.println("字符串" + input + "是一个回文!");
        } else {
            System.out.println("字符串" + input + "不是一个回文!");
        }
    }

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
