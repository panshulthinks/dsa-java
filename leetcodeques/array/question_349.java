package array;
// https://leetcode.com/problems/intersection-of-two-arrays/
public class question_349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;

        // result can be at most min(m, n)
        int[] temp = new int[Math.min(m, n)];
        int index = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (nums1[i] == nums2[j]) {
                    // check if already added to avoid duplicates
                    boolean alreadyAdded = false;
                    for (int k = 0; k < index; k++) {
                        if (temp[k] == nums1[i]) {
                            alreadyAdded = true;
                            break;
                        }
                    }
                    if (!alreadyAdded) {
                        temp[index++] = nums1[i];
                    }
                    break; // stop checking further j for this nums1[i]
                }
            }
        }

        // Copy only the filled part into the final result array
        int[] result = new int[index];
        for (int i = 0; i < index; i++) {
            result[i] = temp[i];
        }

        return result;
    }
}
