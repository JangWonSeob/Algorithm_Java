package Greedy;

import java.util.Scanner;

public class Greedy_16953 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        int count = 1;

        while (true) {
            if (a > b) {
                count = -1;
                break;
            }
            if (a == b) {
                break;
            }
            if (b % 10 == 1) {
                b /= 10;
                count += 1;
            } else if (b % 2 == 0) {
                b /= 2;
                count += 1;
            } else {
                count = -1;
                break;
            }
        }
        System.out.println(count);
    }
}