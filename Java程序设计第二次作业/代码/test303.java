import java.util.Arrays;
import java.util.Scanner;

public class test303 {
    public static void main(String[] args) {
        final int N = 10;  // 设定棍子数量
        Scanner scan = new Scanner(System.in);

        System.out.println("请输入" + N + "根棍子的长度：");
        int[] lengths = new int[N];
        for (int i = 0; i < N; i++) {
            lengths[i] = scan.nextInt();
        }
        scan.close();

        int[] result = findMaxPerimeterTriangle(lengths);

        if (result != null) {
            System.out.println("最大周长的三角形边长分别是: " + result[0] + " " + result[1] + " " + result[2]);
        } else {
            System.out.println("无法组成三角形");
        }
    }

    public static int[] findMaxPerimeterTriangle(int[] lengths) {
        Arrays.sort(lengths);  // 排序数组

        // 从数组末端开始，找到符合三角形条件的最大周长
        for (int i = lengths.length - 1; i >= 2; i--) {
            if (lengths[i - 1] + lengths[i - 2] > lengths[i]) {
                // 如果找到了满足条件的三根棍子
                return new int[] { lengths[i - 2], lengths[i - 1], lengths[i] };
            }
        }

        // 如果找不到满足条件的三根棍子
        return null;
    }
}
