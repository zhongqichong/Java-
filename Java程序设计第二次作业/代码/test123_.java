import java.util.Scanner;

public class test123_ {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("请输入一个字符串：");
        String input = scan.nextLine();
        System.out.print("请输入一个整数：");
        int k = scan.nextInt();

        System.out.println("取出" + k + "个字符的全部排列是：");
        permuteHelper(input, "", k);
    }

    private static void permuteHelper(String input, String prefix, int k) {
        if (prefix.length() == k) {
            System.out.println(prefix);
            return;
        }

        for (int i = 0; i < input.length(); i++) {
            permuteHelper(input.substring(0, i) + input.substring(i + 1), prefix + input.charAt(i), k);
        }
    }
}
