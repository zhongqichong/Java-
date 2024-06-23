import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class test106 {
    public static void main(String[] args) throws Exception {
        String sourceFolderPath = "d:/def";
        String targetFolderPath = "c:/abc";

        File sourceFolder = new File(sourceFolderPath);
        File targetFolder = new File(targetFolderPath);
        Path sourcePath = sourceFolder.toPath();
        Path targetPath = targetFolder.toPath().resolve(sourceFolder.getName());

        Files.move(sourcePath, targetPath, StandardCopyOption.REPLACE_EXISTING);
        System.out.println("移动完成！");
    }
}
