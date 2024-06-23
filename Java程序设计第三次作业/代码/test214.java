import java.util.*;

public class test214 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        for (int i = 0; i < n; i++) {
            String command = scan.nextLine();
            double x = 0, y = 0;
            double dir = 0;
            for (int j = 0; j < command.length(); j++) {
                char c = command.charAt(j);
                if (c == 'L') {
                    dir += Math.PI / 2;
                } else if (c == 'R') {
                    dir -= Math.PI / 2;
                } else {
                    int len = 0;
                    while (j < command.length() && Character.isDigit(command.charAt(j))) {
                        len = len * 10 + command.charAt(j) - '0';
                        j++;
                    }
                    j--;
                    x += len * Math.cos(dir);
                    y += len * Math.sin(dir);
                }
            }
            System.out.println(String.format("%.2f", Math.sqrt(x * x + y * y)));
        }
    }
}
