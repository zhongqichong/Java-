import java.io.*;
import java.nio.file.*;
import java.util.*;

public class test118 {
    public static void main(String[] args) {
        String inputFileName = "e:/data.txt";
        String outputFileName = "e:/result.txt";

        try {
            String content = new String(Files.readAllBytes(Paths.get(inputFileName)));

            Map<Character, Integer> frequencyMap = new LinkedHashMap<>();

            for (char ch : content.toCharArray()) {
                if (Character.isWhitespace(ch)) {
                    continue;
                }
                frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
            }

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName))) {
                for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
                    writer.write("(" + entry.getKey() + "," + entry.getValue() + ")");
                }
                System.out.println("结果已写入文件：" + outputFileName);
            }
        } catch (IOException e) {
            System.err.println("读取或写入文件时出错: " + e.getMessage());
        }
    }
}
