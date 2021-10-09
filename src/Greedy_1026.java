import java.util.*;

public class Greedy_1026 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), sum = 0, arrA[] = new int[n], intArrB[] = new int[n];
        Integer[] arrB = Arrays.stream(intArrB).boxed().toArray(Integer[]::new);
        for (int i = 0; i < n; i++) {
            arrA[i] = scanner.nextInt();
        }
        Arrays.sort(arrA);
        for (int i = 0; i < n; i++) {
            arrB[i] = scanner.nextInt();
        }
        Arrays.sort(arrB, Collections.reverseOrder());
        System.out.println(Arrays.toString(arrA));
        System.out.println(Arrays.toString(arrB));
        for (int i = 0; i < n; i++) {
            sum += arrA[i] * arrB[i];
        }
        System.out.println(sum);
    }
}
