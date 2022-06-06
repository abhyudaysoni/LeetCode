package questions.Arrays;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;
        int k = 0;
        int[] nums3 = new int[m + n];
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                nums3[k] = nums1[i];
                i++;
            } else {
                nums3[k] = nums2[j];
                j++;
            }
            k++;
        }
        while (i < m) {
            nums3[k] = nums1[i];
            i++;
            k++;
        }
        while (j < n) {
            nums3[k] = nums2[j];
            j++;
            k++;
        }
        for (int l = 0; l < nums1.length; l++) {
            nums1[l] = nums3[l];
        }
    }

    public void merge2(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                nums1[k] = nums1[i];
                i++;
            } else {
                nums1[k] = nums2[j];
                j++;
            }
            k++;
        }
        while (i < m) {
            nums1[k] = nums1[i];
            i++;
            k++;
        }
        while (j < n) {
            nums1[k] = nums2[j];
            j++;
            k++;
        }
    }


}
