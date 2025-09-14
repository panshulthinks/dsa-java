package leetcodeques;
// https://leetcode.com/problems/valid-perfect-square/
public class question_367 {
    public boolean isPerfectSquare(int num) {
        int start = 1;
        int end = num;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            long y = (long) mid * mid;  // prevent overflow

            if (y == num) {
                return true;
            } else if (y < num) {
                start = mid + 1; // move right
            } else {
                end = mid - 1;   // move left
            }
        }

        return false;
    }

    public static void main(String[] args) {
        question_367 solver = new question_367();

        int num = 16;
        System.out.println(num + " is perfect square? " + solver.isPerfectSquare(num));

        num = 14;
        System.out.println(num + " is perfect square? " + solver.isPerfectSquare(num));
    }
}
