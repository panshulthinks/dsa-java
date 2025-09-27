package leetcodeques;
// https://leetcode.com/problems/search-insert-position/description/
public class question_35 {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length;  // notice: not length - 1, because we might insert at the end

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;  // found target
            } else if (nums[mid] < target) {
                left = mid + 1;  // search right half
            } else {
                right = mid;     // search left half
            }
        }

        // if not found, left is the correct insert position
        return left;
    }
}
