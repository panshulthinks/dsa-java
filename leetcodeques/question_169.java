package leetcodeques;
// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
public class question_169 {
    public int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length - 1;
        while(start < end){
            int sum = numbers[start] + numbers[end];
            // int mid = start + (end - start)/2;
            if(target == sum){
                return new int[] {start +1, end +1};
            } else if(sum < target){
                start = start+1;
            } else{
                end = end-1;
            }
        }
        return new int[] {-1, -1};
    }
    public static void main(String[] args) {
        question_169 solver = new question_169();

        int[] numbers = {2, 7, 11, 15};
        int target = 9;

        int[] result = solver.twoSum(numbers, target);

        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}


// the one which i was mainly doing was with looping for and the applying binary search lets see that also
public class question_169 {
    public int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            int complement = target - numbers[i];

            int left = i + 1;
            int right = numbers.length - 1;

            // Binary search for complement
            while (left <= right) {
                int mid = left + (right - left) / 2;

                if (numbers[mid] == complement) {
                    return new int[]{i + 1, mid + 1}; // 1-based indexing
                } else if (numbers[mid] < complement) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        // If no pair found (though the problem guarantees one)
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        question_169 solver = new question_169();

        int[] numbers = {2, 7, 11, 15};
        int target = 9;

        int[] result = solver.twoSum(numbers, target);

        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}