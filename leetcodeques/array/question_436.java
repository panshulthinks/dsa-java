package array;
// https://leetcode.com/problems/find-right-interval/

public class question_436 {
    public int[] findRightInterval(int[][] intervals) {
        int n = intervals.length;
        int[] res = new int[n];

        for (int i = 0; i < n; i++) {
            int end = intervals[i][1];
            int index = -1; 
            int minStart = Integer.MAX_VALUE;

            for (int j = 0; j < n; j++) {
                int startJ = intervals[j][0];
                if (startJ >= end && startJ < minStart) {
                    minStart = startJ;
                    index = j;
                }
            }
            res[i] = index;
        }

        return res;
    }
}
