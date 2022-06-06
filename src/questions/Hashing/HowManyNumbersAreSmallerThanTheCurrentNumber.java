package questions.Hashing;

import java.util.Arrays;
import java.util.Scanner;

public class HowManyNumbersAreSmallerThanTheCurrentNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(arr)));
    }

//    public static int[] smallerNumbersThanCurrent(int[] nums) {
//        int[] res = new int[nums.length];
//        for (int i = 0; i < nums.length; i++) {
//            res[i] = smallerThan(nums, nums[i]);
//        }
//        return res;
//    }
//
//    public static int smallerThan(int[] nums, int num) {
//        int count = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (num > nums[i]) {
//                count++;
//            }
//        }
//        return count;
//    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] res = new int[nums.length];
        int[] nums2 = new int[nums.length];
        for (int i = 0; i < nums2.length; i++) {
            nums2[i] = nums[i];
        }
        Arrays.sort(nums2);
        System.out.println(Arrays.toString(nums2));
        return res;
    }
}
