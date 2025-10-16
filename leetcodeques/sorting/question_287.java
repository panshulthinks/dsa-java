package sorting;
// https://leetcode.com/problems/find-the-duplicate-number/description/
public class question_287 {
    public int findDuplicate(int[] nums) {
        int i=0;
        while(i<nums.length){
            int correctindex = nums[i] -1;
            if(nums[i] != nums[correctindex]){
                int temp = nums[i];
                nums[i] = nums[correctindex];
                nums[correctindex] = temp;
            } else{
                i++;
            }
        }
        for(i=0; i<nums.length; i++){
            if(nums[i] != i+1){
                return nums[i];           
            }
        }
        return nums[i];
    }
}
