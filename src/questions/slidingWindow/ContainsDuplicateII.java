package questions.slidingWindow;

import java.util.HashMap;
import java.util.Scanner;

public class ContainsDuplicateII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(containsNearbyDuplicate(arr, k));
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!hm.containsKey(nums[i])) {
                hm.put(nums[i], i);
                System.out.println(hm);
            } else {
                int temp = hm.get(nums[i]);
                if (!(Math.abs(temp - i) <= k)) {
                    hm.put(nums[i], i);
                } else {
                    return true;
                }
            }
        }
        System.out.println(hm);
        return false;
    }
}
