package leetcodeques;
// https://leetcode.com/problems/sqrtx/description/
public class question_69 {
    public int mySqrt(int x) {
        int left = 1;
        int right = x;
        int ans = 0;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if ((long) mid * mid == x) {
                return mid;
            } else if ((long) mid * mid < x) {
                ans = mid;       // store possible answer
                left = mid + 1;  // move right
            } else {
                right = mid - 1; // move left
            }
        }
        
        return ans;
    }

    public static void main(String[] args) {
        question_69 solver = new question_69();
        
        int x = 10;
        int result = solver.mySqrt(x);
        
        System.out.println("The integer square root of " + x + " is: " + result);
    }
}

