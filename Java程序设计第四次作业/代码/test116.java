import java.io.*;

public class test116 {
    public static void main(String[] args) {
        String inputFilePath = "e:/data.txt";
        String outputFilePath = "e:/data90.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath)); BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {
            String line;
            String[][] data = null;
            int m = 0;
            int n = 0;

            while ((line = reader.readLine()) != null) {
                String[] values = line.trim().split("\\s+");
                if (data == null) {
                    n = values.length;
                    data = new String[n][];
                }
                data[m] = values;
                m++;
            }

            for (int col = 0; col < n; col++) {
                for (int row = 0; row < m; row++) {
                    writer.write(data[row][col] + " ");
                }
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("文件出错");
        }
    }
}