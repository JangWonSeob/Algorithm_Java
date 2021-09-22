import java.util.Arrays;
import java.util.Scanner;

public class Greedy_16435 {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), l = scanner.nextInt(), h[] = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = scanner.nextInt();
        }
        Arrays.sort(h);
        for (int i = 0; i < n; i++) {
            if(h[i] <= l){
                l += 1;
            }
        }
        System.out.println(l);
    }
}
