import java.util.*;

public class test206 {
    public static double calc(String s) {
        double weight = 0.0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'C') {
                weight += 12.01 * getnum(s, i + 1);
            } else if (c == 'H') {
                weight += 1.008 * getnum(s, i + 1);
            } else if (c == 'O') {
                weight += 16.00 * getnum(s, i + 1);
            } else if (c == 'N') {
                weight += 14.01 * getnum(s, i + 1);
            }
        }
        return weight;
    }

    public static int getnum(String s, int idx) {
        int number = 0;
        while (idx < s.length() && Character.isDigit(s.charAt(idx))) {
            number = number * 10 + (s.charAt(idx) - '0');
            idx++;
        }
        return number == 0 ? 1 : number;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入分子式：");
        String s = scan.nextLine();
        double weight = calc(s);
        System.out.printf("分子式：%s 的分子量为%.3fg/mol。\n", s, weight);
    }
}
