import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test113 {
    public static void main(String[] args) throws Exception {
        String sourceFilePath = "e:/t1.txt";
        String targetFilePath = "e:/t2.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(sourceFilePath)); BufferedWriter writer = new BufferedWriter(new FileWriter(targetFilePath))) {
            String line;
            Pattern pattern = Pattern.compile("\\d+");
            while ((line = reader.readLine()) != null) {
                Matcher matcher = pattern.matcher(line);
                while (matcher.find()) {
                    writer.write(matcher.group() + " ");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("处理文件时出错。");
        }
    }
}
