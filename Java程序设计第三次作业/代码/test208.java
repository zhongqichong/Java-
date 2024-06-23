import java.util.*;

public class test208 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入模板串：");
        String tmp = scan.next();
        System.out.print("请输入数据源串：");
        String data = scan.next();
        String[] pairs = data.split(",");
        for (String pair : pairs) {
            String[] p = pair.split(":");
            String var = "${" + p[0] + "}";
            String val = p[1];
            tmp = tmp.replace(var, val);
        }
        System.out.println("结果：" + tmp);
    }
}
