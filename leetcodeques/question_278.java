package leetcodeques;
// https://leetcode.com/problems/first-bad-version/description/
public class question_278 {
    public int firstBadVersion(int n) {
        int left = 1, right = n;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            
            if (isBadVersion(mid)) {
                // mid might be the first bad version,
                // but check if there is an earlier one
                right = mid;
            } else {
                // mid is good, so the first bad must be after mid
                left = mid + 1;
            }
        }
        
        return left; // or right (both are same here)
    }
}
