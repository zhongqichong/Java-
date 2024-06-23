import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test301 {

    // 主函数
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入一个正整数： ");
        int number = scan.nextInt();
        scan.close();

        List<List<Integer>> partitions = new ArrayList<>();
        partition(number, number, new ArrayList<>(), partitions);

        System.out.println("整数" + number + "有" + partitions.size() + "种拆分方式。拆分结果如下：");
        printPartitions(partitions);
    }

    // 生成拆分方式的递归函数
    public static void partition(int n, int max, List<Integer> current, List<List<Integer>> partitions) {
        if (n == 0) {
            partitions.add(new ArrayList<>(current));
            return;
        }

        for (int i = Math.min(max, n); i >= 1; i--) {
            current.add(i);
            partition(n - i, i, current, partitions);
            current.remove(current.size() - 1);
        }
    }

    // 输出拆分结果的辅助函数
    public static void printPartitions(List<List<Integer>> partitions) {
        for (List<Integer> partition : partitions) {
            for (int i = 0; i < partition.size(); i++) {
                if (i > 0) {
                    System.out.print("+");
                }
                System.out.print(partition.get(i));
            }
            System.out.println();
        }
    }
}
