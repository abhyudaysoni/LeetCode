package questions.slidingWindow;

import java.util.Scanner;

public class MaximumAverageSubArrayI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(findMaxAverage(arr, k));
    }

    public static double findMaxAverage(int[] nums, int k) {
        double maxAvg = 0.0;
        return maxAvg;
    }
}
