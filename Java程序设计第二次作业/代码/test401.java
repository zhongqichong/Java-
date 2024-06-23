import java.util.Scanner;

public class test401 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("初始球数=");
        int n = scan.nextInt();
        if (dfs(n))
            System.out.println("A赢");
        else
            System.out.println("A输");
    }
    public static boolean dfs(int x) {
        if (x == 1)
            return false;
        int[] num = { 1, 3, 7, 8 };
        for (int i = 0; i < 4; i++)
            if (x - num[i] > 0 && !dfs(x - num[i]))
                return true;
        return false;
    }
}