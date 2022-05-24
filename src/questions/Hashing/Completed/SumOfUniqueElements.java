package questions.Hashing.Completed;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SumOfUniqueElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(sumOfUnique(arr));
    }

    public static int sumOfUnique(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
        }
        int sum = 0;
        System.out.println(hm);
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            if (entry.getValue() == 1) {
                sum = sum + entry.getKey();
            }
        }
        return sum;
    }
}
