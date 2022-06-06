package questions.Hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NumberOfGoodPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(numIdenticalPairs(arr));
    }

//
//    public static int numIdenticalPairs(int[] nums) {
//        int count = 0;
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i; j < nums.length; j++) {
//                if (nums[i] == nums[j] && i < j) {
//                    count++;
//                }
//            }
//        }
//        return count;
//    }

    public static int numIdenticalPairs(int[] nums) {
        int count = 0;
        HashMap<Integer, Integer> hm = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            int n = entry.getValue();
            int pairs = n * (n - 1) / 2;
            System.out.println(n);
            System.out.println(pairs);
            count = count + pairs;
        }
        System.out.println(hm);
        return count;
    }

    /* Alternate solution with time complexity O(n)
    public int numIdenticalPairs(int[] A) {
        int res = 0, count[] = new int[101];
        for (int a: A) {
            res += count[a]++;
        }
        return res;
    }
    */
}
