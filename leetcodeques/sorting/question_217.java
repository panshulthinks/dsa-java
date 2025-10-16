package sorting;

import java.util.Arrays;

// https://leetcode.com/problems/contains-duplicate/description/


public class question_217 {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){
            if(i+1<nums.length && nums[i] == nums[i+1]){
                return true;
            }
        }
        return false;
    }
}







// THIS SOLUTION WILL GIVE A TLE (BRUTE FORCE USING ARRAYS)

// public boolean containsDuplicate(int[] nums) {
//         for(int i=0; i<nums.length; i++){
//             for(int j=i+1; j<nums.length; j++){
//                 if(nums[i] == nums[j] ){
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }
