package Greedy;

import java.util.Scanner;

public class Greedy_14655 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int n, sum=0;

        n = scanner.nextInt();
        int[] v = new int[n];

        for (int i = 0; i < n; i++){
            v[i] = Math.abs(scanner.nextInt());
            sum += v[i];
        }
        sum = sum * 2;
        System.out.println(sum);
    }
}
