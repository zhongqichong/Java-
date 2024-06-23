import java.util.Scanner;

public class test405 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("请输入n值：");
        int n = scan.nextInt();

        a = new int[n];
        System.out.print("请输入各个ai的值：");
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }

        m = new int[n];
        System.out.print("请输入各个mi的值：");
        for (int i = 0; i < n; i++) {
            m[i] = scan.nextInt();
        }

        System.out.print("请输入K值：");
        int k = scan.nextInt();

        result = new int[n];

        if (findCombination(0, 0, k)) {
            System.out.println("可以组成。方法：");
            StringBuilder combination = new StringBuilder();
            for (int i = 0; i < n; i++) {
                if (result[i] > 0) {
                    combination.append(a[i]).append("*").append(result[i]).append("+");
                }
            }
            combination.deleteCharAt(combination.length() - 1);  // Remove the last "+"
            combination.append("=").append(k);
            System.out.println(combination);
        } else {
            System.out.println("不能组成");
        }

        scan.close();
    }
    static int[] a;
    static int[] m;
    static int[] result;

    public static boolean findCombination(int currentSum, int index, int targetSum) {
        if (currentSum == targetSum) {
            return true;
        }
        if (currentSum > targetSum || index == a.length) {
            return false;
        }

        for (int i = 0; i <= m[index]; i++) {
            result[index] = i;
            if (findCombination(currentSum + a[index] * i, index + 1, targetSum)) {
                return true;
            }
            result[index] = 0;
        }
        return false;
    }

}
