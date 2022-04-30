package questions.Arrays.completed;

import java.util.Arrays;
import java.util.Scanner;

public class MedianOfTwoSortedArrays {
    public static double medianOfTwoSortedArrays(int[] nums1, int[] nums2) {
        double median = 0.0;
        int[] nums3 = merge(nums1, nums2);
        System.out.println(Arrays.toString(nums3));
        if (nums3.length % 2 == 0) {
            median = (nums3[(nums3.length - 1) / 2] + nums3[((nums3.length - 1) / 2) + 1]) / 2d;
            System.out.println(median);
            return median;
        } else {
            median = nums3[nums3.length / 2];
            System.out.println(median);
            return median;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();

        int[] arr1 = new int[m];
        for (int i = 0; i < m; i++) {
            arr1[i] = sc.nextInt();
        }
        int n = sc.nextInt();
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }

        System.out.println(medianOfTwoSortedArrays(arr1, arr2));
    }

    public static int[] merge(int[] nums1, int[] nums2) {
        int[] nums3 = new int[nums1.length + nums2.length];
        int i = 0, j = 0, k = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                nums3[k] = nums1[i];
                i++;
            } else {
                nums3[k] = nums2[j];
                j++;
            }
            k++;
        }
        while (i < nums1.length) {
            nums3[k] = nums1[i];
            i++;
            k++;
        }
        while (j < nums2.length) {
            nums3[k] = nums2[j];
            j++;
            k++;
        }
        return nums3;
    }
}
