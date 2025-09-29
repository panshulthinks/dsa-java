package binarysearch;
// https://leetcode.com/problems/single-element-in-a-sorted-array/description/

public class question_540 {
    public int singleNonDuplicate(int[] nums) {
        int l = 0, r = nums.length - 1;

        while (l <= r) {
            int m = l + (r - l) / 2;

            boolean isUnique = 
                (m - 1 < 0 || nums[m - 1] != nums[m]) &&
                (m + 1 == nums.length || nums[m] != nums[m + 1]);
            if (isUnique) {
                return nums[m];
            }

            int leftSize = (m > 0 && nums[m - 1] == nums[m]) ? m - 1 : m;

            if (leftSize % 2 == 1) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return -1;
    }
}
