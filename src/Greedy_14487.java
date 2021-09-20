import java.util.Arrays;
import java.util.Scanner;

public class Greedy_14487 {
    public static void main(String[] args) {
        int n;
        int sum = 0;

        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        int[] v = new int[n];
        for (int i = 0; i < n; i++) {
            v[i] = scanner.nextInt();
        }
        Arrays.sort(v);
        for (int i = 0; i < n - 1; i++) {
            sum = sum + v[i];
        }
        System.out.println(sum);
    }
}
