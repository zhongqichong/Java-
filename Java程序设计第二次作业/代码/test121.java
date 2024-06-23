import java.util.Scanner;

public class test121 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("请输入正整数的个数：");
        int N = scan.nextInt();
        int[] numbers = new int[N];
        System.out.println("请输入" + N + "个正整数：");
        for (int i = 0; i < N; i++) {
            numbers[i] = scan.nextInt();
        }

        while (true) {
            int currentMax = Integer.MIN_VALUE;
            int maxCount = 0;
            int maxIndicesCount = 0;
            int[] maxIndices = new int[N];

            for (int i = 0; i < N; i++) {
                if (numbers[i] > currentMax) {
                    currentMax = numbers[i];
                }
            }

            for (int i = 0; i < N; i++) {
                if (numbers[i] == currentMax) {
                    maxCount++;
                    maxIndices[maxIndicesCount++] = i;
                }
            }

            System.out.print(currentMax + " 出现" + maxCount + "次 位置在 ");
            for (int i = 0; i < maxIndicesCount; i++) {
                System.out.print(maxIndices[i] + " ");
            }
            System.out.println();

            for (int i = 0; i < maxIndicesCount; i++) {
                numbers[maxIndices[i]] = 0;
            }

            boolean allZero = true;
            for (int num : numbers) {
                if (num != 0) {
                    allZero = false;
                    break;
                }
            }
            if (allZero) {
                break;
            }
        }
    }
}
