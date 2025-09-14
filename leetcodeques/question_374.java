package leetcodeques;
// https://leetcode.com/problems/guess-number-higher-or-lower/description/
public class question_374 {
    public int guessNumber(int n) {
    int start = 0;
    int end = n;

    while (start <= end) {
        int mid = start + (end - start) / 2;

        if (mid < n) {
            start = mid + 1;
        } else if (mid > n) {
            end = mid - 1;
        } else {
            return mid; // found the number
        }
    }

    return -1; // not found (shouldn't happen if number is between 0 and n)
}

}
