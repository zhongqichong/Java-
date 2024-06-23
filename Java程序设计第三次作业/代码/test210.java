import java.util.Scanner;

public class test210 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("请输入一个串：");
        String input = scan.nextLine();

        String result = reverseWords(input);

        System.out.println("翻转结果：" + result);

        scan.close();
    }

    private static String reverseWords(String input) {
        StringBuilder result = new StringBuilder();
        int length = input.length();
        int i = 0;

        while (i < length) {
            if (Character.isLetter(input.charAt(i))) {
                int start = i;
                while (i < length && Character.isLetter(input.charAt(i))) {
                    i++;
                }
                String word = input.substring(start, i);
                result.append(new StringBuilder(word).reverse());
            } else {
                result.append(input.charAt(i));
                i++;
            }
        }

        return result.toString();
    }
}
