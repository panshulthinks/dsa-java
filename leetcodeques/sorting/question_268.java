package sorting;

public class question_268 {
    public int missingNumber(int[] nums) {
        int i=0;
        while(i < nums.length){
            int correctindex = nums[i];// we did this cause the array is from 0 to n
            // not from 1 to n
            if(nums[i] < nums.length && nums[i] != nums[correctindex]){
                int temp = nums[i];
                nums[i] = nums[correctindex];
                nums[correctindex] = temp;
            } else{
                i++;
            }
        }
        for(i=0; i<nums.length; i++){
            if(nums[i] != i){
                return i;
            }
        }
        return nums.length;
    }
}
