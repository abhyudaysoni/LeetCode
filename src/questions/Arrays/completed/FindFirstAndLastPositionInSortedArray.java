package questions.Arrays.completed;

import java.util.Arrays;
import java.util.Scanner;

public class FindFirstAndLastPositionInSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(searchRange(arr, k)));
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] resArr = {-1, -1};

        int l = 0;
        int r = nums.length - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (nums[mid] == target) {
                resArr[0] = mid;
                r = mid - 1;
            } else if (nums[mid] < target) {
                l = mid + 1;
            } else r = mid - 1;
        }

        l = 0;
        r = nums.length - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (nums[mid] == target) {
                resArr[1] = mid;
                l = mid + 1;
            } else if (nums[mid] > target) {
                r = mid - 1;
            } else l = mid + 1;
        }
        return resArr;
    }
}
