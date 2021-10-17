package Greedy;

import java.util.Scanner;

public class Greedy_2720 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(), c[] = new int[t], q[] = new int[t], d[] = new int[t], n[] = new int[t], p[] = new int[t];
        for (int i = 0; i < t; i++) {
            c[i] = scanner.nextInt();
            q[i] = Math.floorDiv(c[i], 25);
            d[i] = Math.floorDiv(Math.floorMod(c[i], 25), 10);
            int m = Math.floorMod(Math.floorMod(c[i], 25), 10);
            n[i] = Math.floorDiv(m, 5);
            p[i] = Math.floorMod(m, 5);
        }
        for (int i =0; i < t; i ++){
            System.out.println(q[i] + " " + d[i] + " " + n[i] + " " + p[i]);
        }
    }
}