import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test115 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int p = scan.nextInt();
        int s = scan.nextInt();
        int t = scan.nextInt();

        scan.close();

        List<Integer> primes = findPrimes(p, s);
        write(primes, t);
    }

    public static List<Integer> findPrimes(int p, int s) {
        List<Integer> primes = new ArrayList<>();

        for (int i = p; i <= s; i++) {
            if (isPrime(i)) primes.add(i);
        }
        return primes;
    }

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) if (num % i == 0) return false;
        return true;
    }

    private static void write(List<Integer> primes, int t) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("p.txt"))) {
            int sum = 0;
            int count = 0;

            for (int num : primes) {
                writer.write(num + " ");
                sum += num;
                count++;

                if (count == t) {
                    writer.write(String.valueOf(sum));
                    writer.newLine();
                    sum = 0;
                    count = 0;
                }
            }

            if (count > 0) {
                writer.write(String.valueOf(sum));
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("写入错误");
        }
    }
}
