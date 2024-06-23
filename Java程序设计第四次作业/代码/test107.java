import java.io.File;

public class test107 {
    public static void main(String[] args) {
        String folderPath = "C:/abc";

        File folder = new File(folderPath);
        System.out.println("文件夹" + folder.getName() + "下的隐藏文件或文件夹如下：");
        show(folder);
    }

    public static void show(File folder) {
        File[] files = folder.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isHidden()) {
                    System.out.println(file.getName());
                }
                if (file.isDirectory()) {
                    show(file);
                }
            }
        }
    }
}