import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class test402 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入三个正整数（A、B、N值）：");
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int N = scanner.nextInt();
        if (B == 0) {
            System.out.println("除数B不能为0！");
            return;
        }
        BigDecimal bigDecimalA = new BigDecimal(A);
        BigDecimal bigDecimalB = new BigDecimal(B);
        BigDecimal result = bigDecimalA.divide(bigDecimalB, N + 1, RoundingMode.HALF_UP);
        if (result.scale() > N) {
            result = result.setScale(N, RoundingMode.DOWN);
        }
        System.out.println(result.toPlainString());
        scanner.close();
    }
}