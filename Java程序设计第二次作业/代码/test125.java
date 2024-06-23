import java.util.Scanner;
import java.util.Arrays;

public class test125 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入字符串的个数：");
        int numberOfStrings = input.nextInt();
        input.nextLine(); // 消耗掉nextInt后的换行符

        String[] strings = new String[numberOfStrings];
        System.out.println("请输入" + numberOfStrings + "个字符串：");
        for (int i = 0; i < numberOfStrings; i++) {
            strings[i] = input.nextLine();
        }

        Arrays.sort(strings);

        System.out.println("按字典次序进行从小到大排序结果如下：");
        for (String str : strings) {
            System.out.println(str);
        }

        input.close();
    }
}
