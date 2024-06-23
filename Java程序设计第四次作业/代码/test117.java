import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class test117 {
    public static void main(String[] args) {
        String outputFilePath = "e:/result.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {
            for (int i = 100; i < 1000; i++) {
                int square = i * i;
                String squareString = String.valueOf(square);
                if (squareString.contains(String.valueOf(i))) {
                    writer.write(i + "    " + square);
                    writer.newLine();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("文件出错");
        }
    }
}