import java.util.Scanner;

public class test122 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("请输入一个字符串：");
        String input = scan.nextLine();

        int[] charCounts = new int[128]; // ASCII码表长度为128
        for (char c : input.toCharArray()) {
            if (c>=48&&c<=57 || c>=65&&c<=90 || c>=97&&c<=122) {
                charCounts[c]++;
            }
        }

        System.out.println("输出界面：（按字符从小到大排序输出）");
        for (int i = 0; i < 128; i++) {
            if (charCounts[i] > 0) {
                System.out.println("字符" + (char) i + "出现" + charCounts[i] + "次；");
            }
        }
    }
}
