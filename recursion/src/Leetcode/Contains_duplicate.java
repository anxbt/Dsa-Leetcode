package Leetcode;

import java.util.Arrays;

public class Contains_duplicate {
    public static void main(String[] args) {
        int[] nums = {0};
        System.out.println(cointainduplicate(nums));
    }

    public static boolean cointainduplicate(int[] nums) {
        Arrays.sort(nums);
        System.out.println(nums.length);
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == nums[i+1]) {
                return true;
            }

        }
        return false;
    }
}

