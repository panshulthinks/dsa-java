package array;
// https://leetcode.com/problems/sort-colors/
public class question_75 {
    public void sortColors(int[] nums) {
        int count0 = 0, count1 = 0, count2 = 0;

        // 1. Count how many 0s, 1s, and 2s
        for (int num : nums) {
            if (num == 0) count0++;
            else if (num == 1) count1++;
            else count2++;
        }

        // 2. Fill the array back in order
        int index = 0;
        while (count0-- > 0) nums[index++] = 0;// basically we can also use a for loop for this but we used while loop for cleaner syntax
        while (count1-- > 0) nums[index++] = 1;// here count-- >0 first checks if count is> zero if it is it then reduces the count values
        while (count2-- > 0) nums[index++] = 2;// then after this it places them in the array
    }
}
