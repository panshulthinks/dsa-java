package array;
// https://leetcode.com/problems/special-array-with-x-elements-greater-than-or-equal-x/description/
public class question_1608 {
    public int specialArray(int[] nums) {
        for(int x=0; x<= nums.length; x++){
            int count = 0;
            for(int num: nums){
                if(num >= x){
                    count++;
                }
            }
            if(count == x){
                return x;
            }
        }
        return -1;
    }
}
