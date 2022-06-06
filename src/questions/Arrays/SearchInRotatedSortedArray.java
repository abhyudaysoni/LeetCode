package questions.Arrays;

import java.util.Scanner;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("search(arr,k) = " + search(arr, k));
    }

    public static int search(int[] nums, int target) {
        return binarySearch(nums, 0, nums.length - 1, target);
    }

    public static int binarySearch(int[] arr, int l, int r, int k) {
        if (l > r) {
            return -1;
        }
        int mid = (l + r) / 2;
        if (arr[mid] == k) {
            return mid;
        }
        if (arr[l] <= arr[mid]) {
            if (k >= arr[l] && k <= arr[mid]) {
                return binarySearch(arr, l, mid - 1, k);
            }
            return binarySearch(arr, mid + 1, r, k);
        }
        if (k >= arr[mid] && k <= arr[r]) {
            return binarySearch(arr, mid + 1, r, k);
        }
        return binarySearch(arr, l, mid - 1, k);
    }
}
