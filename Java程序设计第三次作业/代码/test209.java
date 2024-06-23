import java.util.Scanner;

public class test209 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("请输入行数：");
        int n = scan.nextInt();
        scan.nextLine();  // 消耗换行符

        String[] inputs = new String[n];

        System.out.println("请输入" + n + "行输入数据，每行格式为RC格式：");
        for (int i = 0; i < n; i++) {
            inputs[i] = scan.nextLine();
        }

        System.out.println("转换后的常规地址格式如下：");
        for (String rcAddress : inputs) {
            System.out.println(convertRCToRegular(rcAddress));
        }

        scan.close();
    }

    // 将RC格式转换为常规地址格式
    private static String convertRCToRegular(String rcAddress) {
        // 分离行和列
        String[] parts = rcAddress.split("R|C");
        int row = Integer.parseInt(parts[1]);
        int col = Integer.parseInt(parts[2]);

        // 将列号转换为字母表示
        String colString = convertToColumnLetters(col);

        // 拼接成常规地址格式
        return colString + row;
    }

    // 将列号转换为字母表示
    private static String convertToColumnLetters(int col) {
        StringBuilder sb = new StringBuilder();

        while (col > 0) {
            col--;  // 调整到0索引
            char letter = (char) ('A' + col % 26);
            sb.insert(0, letter);
            col /= 26;
        }

        return sb.toString();
    }
}
