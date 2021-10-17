package Greedy;

import java.util.Scanner;

// 사과 담기
public class Greedy_2828 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(), m = scanner.nextInt(), j = scanner.nextInt();
        int start = 1, end = start +(m - 1), move = 0;

        for (int i = 0; i < j; i++) {
            int app = scanner.nextInt();

            // 바구니 내부
            if (start <= app && app <= end) {
                continue;
            }

            // 왼쪽으로 이동
            if (start > app) {
                move += start - app;
                start = app;
                end = start + (m - 1);
            }
            // 오른쪽으로 이동
            else if (end < app) {
                move += app - end;
                end = app;
                start = end - (m - 1);
            }
        }
        System.out.println(move);
    }
}
