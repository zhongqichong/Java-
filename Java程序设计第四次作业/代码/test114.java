import java.io.*;

public class test114 {
    public static void main(String[] args) {
        String sourceFilePath = "e:/score.txt";
        String targetFilePath = "e:/result.txt";

        int chineseTot = 0, mathTot = 0, count = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(sourceFilePath)); BufferedWriter writer = new BufferedWriter(new FileWriter(targetFilePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\\s+");
                String studentId = parts[0];
                String name = parts[1];
                int chinese = Integer.parseInt(parts[2]);
                int math = Integer.parseInt(parts[3]);

                int totalScore = chinese + math;
                writer.write(studentId + "  " + name + "  总分：" + totalScore + "\n");

                chineseTot += chinese;
                mathTot += math;
                count++;

            }
            if (count > 0) {
                double chineseAverage = (double) chineseTot / count;
                double mathAverage = (double) mathTot / count;
                writer.write("语文平均分：" + String.format("%.1f", chineseAverage) + "\n");
                writer.write("数学平均分：" + String.format("%.1f", mathAverage) + "\n");
            }
            else {
                System.out.println("无记录");
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("文件错误");
        } catch (NumberFormatException e) {
            System.out.println("格式错误");
        }
    }
}
