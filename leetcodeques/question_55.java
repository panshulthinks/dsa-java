package leetcodeques;
import java.util.*;
// https://leetcode.com/problems/jump-game/

public class question_55 {
    public boolean canJump(int[] nums) {
        int steps = nums[0]; // how far we can go initially

        for (int i = 1; i < nums.length; i++) {
            steps--; // moving forward uses 1 step

            if (steps < 0) {
                return false; // stuck before reaching this index
            }

            // refill steps if nums[i] allows a farther jump
            steps = Math.max(steps, nums[i]);
        }

        return true; // reached the end
    }
    public static void main(String[] args){
        question_55 answer = new question_55();

        int[] nums = {2, 3, 1, 1, 4};
        System.out.println("RESULT " + answer.canJump(nums));
    }
}
