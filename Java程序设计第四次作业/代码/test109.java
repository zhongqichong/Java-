import java.nio.charset.Charset;

public class test109 {
    public static void main(String[] args) {
        Charset defaultCharset = Charset.defaultCharset();
        System.out.println("本平台字符流中所采用的默认的汉字字符集是：" + defaultCharset.displayName());
    }
}
