import java.util.Scanner;
import java.util.Stack;

public class test212 {
    public static int loc(String s, int i) {
        int q = 1;
        do {
            i++;
            if (s.charAt(i) == '(') q++;
            else if (s.charAt(i) == ')') q--;
        } while (q != 0);
        return i;
    }

    public static int find(String s) {
        int i = 0, k = 0;
        while (i < s.length()) {
            if (s.charAt(i) == '+' || s.charAt(i) == '-') return i;
            if (k == 0 && (s.charAt(i) == '*' || s.charAt(i) == '/')) k = i;
            if (s.charAt(i) == '(') i = loc(s, i);
            i++;
        }
        return k;
    }

    public static String del(String s) {
        int i = s.indexOf('('), j = s.lastIndexOf(')');
        if (i == -1 && j == -1) return s;

        if (s.charAt(0) == '(' && loc(s, 0) == s.length() - 1) {
            return del(s.substring(1, s.length() - 1));
        }

        i = find(s);
        char p = s.charAt(i);

        String left = del(s.substring(0, i));
        String right = del(s.substring(i + 1));

        if ((p == '*' || p == '/') && (left.contains("+") || left.contains("-"))) {
            left = "(" + left + ")";
        }

        if ((p == '*' || p == '/') && (right.contains("+") || right.contains("-")) || (p == '/' && !right.trim().isEmpty())) {
            right = "(" + right + ")";
        }
        return left + p + right;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("请输入表达式：");
        String expression = scan.nextLine();

        String result = del(expression);

        System.out.println("去掉多余括号后，结果是：" + result);
    }
}
