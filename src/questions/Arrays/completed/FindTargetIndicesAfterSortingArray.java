package questions.Arrays.completed;

import java.util.*;

public class FindTargetIndicesAfterSortingArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(targetIndices(arr, k));
    }

    public static List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> res = new ArrayList<>();
        Arrays.sort(nums);
        int l = 0;
        int r = nums.length - 1;
        binarySearch(nums, l, r, target, res);
        Collections.sort(res);
        return res;
    }

    public static void binarySearch(int[] arr, int l, int r, int k, List<Integer> res) {
        if (l > r) {
            return;
        }
        int mid = (l + r) / 2;
        if (arr[mid] == k) {
            res.add(mid);
        }
        binarySearch(arr, mid + 1, r, k, res);
        binarySearch(arr, l, mid - 1, k, res);
    }
}
