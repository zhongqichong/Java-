import java.io.File;
import java.util.Scanner;

public class test105 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个文件夹（如：c:/abc）：");
        String folderPath = scan.nextLine();
        File folder = new File(folderPath);

        if (!folder.exists() || !folder.isDirectory()) {
            System.out.println("输入的路径不是有效的文件夹！");
        } else {
            FolderStats stats = new FolderStats();
            getFolderStatistics(folder, stats);

            System.out.println("文件夹 " + folderPath + " 下的子文件夹的总数：" + stats.folderCount);
            System.out.println("文件总数：" + stats.fileCount);
            System.out.println("文件总的空间：" + stats.totalSize + " 字节");
        }

        scan.close();
    }

    private static void getFolderStatistics(File folder, FolderStats stats) {
        File[] files = folder.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    stats.folderCount++;
                    getFolderStatistics(file, stats);
                } else if (file.isFile()) {
                    stats.fileCount++;
                    stats.totalSize += file.length();
                }
            }
        }
    }
}

class FolderStats {
    int folderCount = 0;
    int fileCount = 0;
    long totalSize = 0;
}
