package Leetcode;


import java.util.Arrays;

public class xxx {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int m = 3;
        int n = 3;
        int[] mergedArray = merge(nums1, nums2, m, n);
        System.out.println("Merged Array: " + Arrays.toString(mergedArray));
    }

    static int[] merge(int[] nums1, int[] nums2, int m, int n) {
        int[] mix = new int[m + n];
        int i = 0, j = 0, k = 0;

        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                mix[k] = nums1[i];
                i++;
            } else {
                mix[k] = nums2[j];
                j++;
            }
            k++;
        }

        // Copy any remaining elements from nums1, if any
        while (i < m) {
            mix[k] = nums1[i];
            i++;
            k++;
        }

        // Copy any remaining elements from nums2, if any
        while (j < n) {
            mix[k] = nums2[j];
            j++;
            k++;
        }

        return mix;
    }
}
