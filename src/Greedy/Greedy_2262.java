package Greedy;

import java.util.*;

public class Greedy_2262 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), outIndex = 0, minDiff = 100000, sum = 0;
        ArrayList<Integer> rank = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            rank.add(scanner.nextInt());
        }
        for (int a = 0; a < n -1 ; a++ ){
            for (int i = 0; i < n - (1 + a); i++) {
                if (i == 0) {
                    minDiff = Math.abs(rank.get(i) - rank.get(i + 1));
                } else if (i > 0) {
                    if (rank.get(i) > rank.get(i + 1)) {
                        if (minDiff > (rank.get(i) - rank.get(i + 1))) {
                            minDiff = rank.get(i) - rank.get(i + 1);
                            outIndex = i;
                        }
                    } else {
                        if (minDiff > (rank.get(i + 1) - rank.get(i))) {
                            minDiff = rank.get(i + 1) - rank.get(i);
                            outIndex = i + 1;
                        }
                    }
                }
            }
            sum += minDiff;
            rank.remove(outIndex);
        }
        System.out.println(sum);
    }
}
