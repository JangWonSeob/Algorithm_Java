package Greedy;

import java.util.*;

public class Greedy_13164 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt(), arr[] = new int[n], diff[] = new int[n - 1], sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            diff[i] = arr[i + 1] - arr[i];
        }
        Arrays.sort(diff);
        for (int i = 0; i < n - k; i++) {
            sum += diff[i];
        }
        System.out.println(sum);
    }
}