import java.util.Scanner;

public class test404 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("请输入竿子长度L值：");
        int rodLength = scan.nextInt();

        System.out.print("请输入蚂蚁数量n值：");
        int numberOfAnts = scan.nextInt();

        int[] distances = new int[numberOfAnts];
        System.out.print("请输入每只蚂蚁的距离：");
        for (int i = 0; i < numberOfAnts; i++) {
            distances[i] = scan.nextInt();
        }

        int[] directions = new int[numberOfAnts];
        int minTime = calculateMinTime(distances, directions, rodLength);
        System.out.print("最短时间：" + minTime + " 朝向：");
        for (int i = 0; i < numberOfAnts; i++) {
            System.out.print(getDirection(directions[i]) + " ");
        }
        System.out.println();

        int maxTime = calculateMaxTime(distances, directions, rodLength);
        System.out.print("最长时间：" + maxTime + " 朝向：");
        for (int i = 0; i < numberOfAnts; i++) {
            System.out.print(getDirection(directions[i]) + " ");
        }
    }
    public static String getDirection(int dir) {
        return dir == -1 ? "左" : "右";
    }

    public static int calculateMinTime(int[] distances, int[] directions, int rodLength) {
        int maxTime = 0;
        for (int i = 0; i < distances.length; i++) {
            int distanceToEdge;
            if (distances[i] < rodLength - distances[i]) {
                distanceToEdge = distances[i];
                directions[i] = -1;
            } else {
                distanceToEdge = rodLength - distances[i];
                directions[i] = 1;
            }
            maxTime = Math.max(maxTime, distanceToEdge);
        }
        return maxTime;
    }

    public static int calculateMaxTime(int[] distances, int[] directions, int rodLength) {
        int maxTime = 0;
        for (int i = 0; i < distances.length; i++) {
            int distanceToEdge;
            if (distances[i] > rodLength - distances[i]) {
                distanceToEdge = distances[i];
                directions[i] = -1;
            } else {
                distanceToEdge = rodLength - distances[i];
                directions[i] = 1;
            }
            maxTime = Math.max(maxTime, distanceToEdge);
        }
        return maxTime;
    }
}
