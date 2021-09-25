import java.util.Scanner;

public class Greedy_15923 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), a[][] = new int[n][2], sum = 0;
        for (int i = 0; i < n; i++) {
            a[i][0] = scanner.nextInt();
            a[i][1] = scanner.nextInt();
            if (i > 0) {
                sum = sum + Math.abs((a[i][0] + a[i][1]) - (a[i - 1][0] + a[i - 1][1]));
            }
            if (i == (n - 1)) {
                sum = sum + Math.abs((a[i][0] + a[i][1]) - (a[0][0] + a[0][1]));
            }
        }
        System.out.println(sum);
    }
}
