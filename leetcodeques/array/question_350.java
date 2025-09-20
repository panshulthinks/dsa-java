package array;

import java.util.Arrays;

// https://leetcode.com/problems/intersection-of-two-arrays-ii/description/


public class question_350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        // Step 1: Sort both arrays
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int m = nums1.length;
        int n = nums2.length;

        // result can't be larger than smaller array
        int[] temp = new int[Math.min(m, n)];
        int index = 0;

        // Step 2: Two pointers
        int i = 0, j = 0;
        while (i < m && j < n) {
            if (nums1[i] == nums2[j]) {
                temp[index++] = nums1[i]; // common element
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++; // move pointer in nums1
            } else {
                j++; // move pointer in nums2
            }
        }

        // Step 3: Copy result
        int[] result = new int[index];
        for (int k = 0; k < index; k++) {
            result[k] = temp[k];
        }
        return result;
    }
}
