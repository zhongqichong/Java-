import java.util.Scanner;

public class test124 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("请输入一个字符串：");
        String input = scan.nextLine();
        System.out.print("请输入一个整数：");
        int k = scan.nextInt();

        System.out.println("取出" + k + "个字符的全部组合是：");
        combineHelper(input, "", 0, k);
    }

    private static void combineHelper(String input, String prefix, int start, int k) {
        if (k == 0) {
            System.out.println(prefix);
            return;
        }

        for (int i = start; i < input.length(); i++) {
            combineHelper(input, prefix + input.charAt(i), i + 1, k - 1);
        }
    }
}
