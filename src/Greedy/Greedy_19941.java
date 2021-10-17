package Greedy;

import java.util.*;

// 미완성 -> 완성 필요
public class Greedy_19941 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), k = scanner.nextInt();
        String input = scanner.next();
        ArrayList<String> arr = new ArrayList<>();
        ArrayList<Integer> num = new ArrayList<>();

        String inputData = input.substring(0, n);

        String[] strArray = inputData.split("");
        for (String s : strArray) {
            arr.add(s);
        }

        for (int i = 0; i < n; i++) {
            if (arr.get(i).equals("P")) {
                for (int a = 1; a <= k; a++) {
                    if (i == 0 || i - a < 0) {
                        if (arr.get(i + a).equals("H") && !num.contains(i + a)) {
                            num.add(i + a);
                            break;
                        }
                    } else if (i == n - 1 || i + a > n - 1) { //고민 중
                        if (arr.get(i - (k - a + 1)).equals("H") && !num.contains(i - (k - a + 1))) {
                            num.add(i - (k - a + 1));
                            break;
                        }
                    } else {
                        if (arr.get(i - (k - a + 1)).equals("H") && !num.contains(i - (k - a + 1))) {
                            num.add(i - (k - a + 1));
                            break;
                        } else {
                            if (arr.get(i + a).equals("H") && !num.contains(i + a)) {
                                num.add(i + a);
                                break;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(num.size());
    }
}