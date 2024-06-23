import java.io.File;

public class test108 {
    public static void main(String[] args) {
        String folderPath = "e:/abc";
        File folder = new File(folderPath);
        System.out.println("以doc为扩展名的文件如下：");
        show(folder);
    }

    public static void show(File folder) {
        File[] files = folder.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isFile() && file.getName().endsWith(".doc")) {
                    System.out.println(file.getName());
                }
                if (file.isDirectory()) {
                    show(file);
                }
            }
        }
    }
}
