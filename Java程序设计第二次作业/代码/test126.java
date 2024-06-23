import java.util.*;

public class test126 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String input = scan.nextLine();
        input = input.toLowerCase(); // 将字符串转换为小写
        String[] words = input.split("\\W+"); // 使用正则表达式分割字符串，提取英文单词

        Map<String, Integer> wordCountMap = new TreeMap<>(); // 使用TreeMap存储单词及其出现次数，保证字典序
        for (String word : words) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        List<Map.Entry<String, Integer>> list = new ArrayList<>(wordCountMap.entrySet());
        list.sort((o1, o2) -> {
            int cmp = o2.getValue().compareTo(o1.getValue());
            if (cmp != 0) {
                return cmp;
            } else {
                return o1.getKey().compareTo(o2.getKey());
            }
        });

        for (Map.Entry<String, Integer> entry : list) {
            System.out.println(entry.getKey() + "出现" + entry.getValue() + "次；");
        }
    }
}
