package leetcodeques;
// https://leetcode.com/problems/rotate-array/


public class question_189 {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // in case k > n
        
        for(int step = 0; step < k; step++){
            int temp = nums[n - 1]; // save last element
            
            // shift all elements right by 1
            for(int j = n - 1; j > 0; j--){
                nums[j] = nums[j - 1];
            }
            
            nums[0] = temp; // put last element at front
        }
    }
}
