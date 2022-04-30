package questions.Arrays.completed;

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

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            res[i] = smallerThan(nums, nums[i]);
        }
        return res;
    }

    public static int smallerThan(int[] nums, int num) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (num > nums[i]) {
                count++;
            }
        }
        return count;
    }
}
