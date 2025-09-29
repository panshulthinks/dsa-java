package binarysearch;
// https://leetcode.com/problems/arranging-coins/description/
public class question_441 {
    public int arrangeCoins(int n) {
        int start = 0;
        int end = n;
        int res = 0;  // keep track of the last valid row

        while (start <= end) {
            int mid = start + (end - start) / 2;
            long coins = (long) mid * (mid + 1) / 2; // sum of first mid rows

            if (coins == n) {
                return mid; // perfect staircase
            } else if (coins < n) {
                res = mid;       // mid rows can be built
                start = mid + 1; // try bigger
            } else {
                end = mid - 1;   // too many coins, try smaller
            }
        }
        return res;
    }

    public static void main(String[] args) {
        question_441 solver = new question_441();

        int n1 = 5;
        int n2 = 8;

        System.out.println("n = " + n1 + " → full rows = " + solver.arrangeCoins(n1));
        System.out.println("n = " + n2 + " → full rows = " + solver.arrangeCoins(n2));
    }
}





// also here is a solution which is done with triangular numbers like having a for loop and then using binary search
public class question_441 {
    public int arrangeCoins(int n) {
        // Step 1: build prefix sums (triangular numbers)
        long[] coins = new long[n + 1];
        for (int i = 1; i <= n; i++) {
            coins[i] = coins[i - 1] + i; // triangular number
            if (coins[i] > n) break;     // stop early
        }

        // Step 2: binary search on this array
        int left = 1, right = n, res = 0;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (coins[mid] == n) {
                return mid; // perfect fit
            } else if (coins[mid] < n) {
                res = mid;      // possible answer
                left = mid + 1; // look right
            } else {
                right = mid - 1; // look left
            }
        }

        return res;
    }

    public static void main(String[] args) {
        question_441 solver = new question_441();

        System.out.println("n = 5 → full rows = " + solver.arrangeCoins(5));
        System.out.println("n = 8 → full rows = " + solver.arrangeCoins(8));
        System.out.println("n = 1 → full rows = " + solver.arrangeCoins(1));
    }
}
