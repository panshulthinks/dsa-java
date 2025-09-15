package leetcodeques;
// https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/description/
public class question_1351 {
     public int countNegatives(int[][] grid) {
        int m = grid.length;
        int negative_nos = 0;

        for (int i = 0; i < m; i++) {
            int n = grid[i].length;
            for (int j = 0; j < n; j++) {
                if (grid[i][j] < 0) {
                    negative_nos++;
                }
            }
        }
        return negative_nos;
    }
}


// but ofc it is a sorted array we can also use binarysearch here
// lets see more optimized soln




// public class question_1351{
//     public int countNegatives(int[][] grid) {
//         int m = grid.length;
//         int negative_nos = 0;

//         for (int i = 0; i < m; i++) {
//             int n = grid[i].length;
//             int left = 0;
//             int right = n - 1;
            
//             while (left <= right) {
//                 int mid = left + (right - left) / 2;
//                 if (grid[i][mid] < 0) {
//                     right = mid - 1; // go left to find earlier negative
//                 } else {
//                     left = mid + 1;  // go right
//                 }
//             }
//             // after loop, left = index of first negative
//             negative_nos += (n - left);
//         }

//         return negative_nos;
//     }
// }