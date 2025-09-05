package arrays;

public class test1linearsearch {

    public static void main(String[] args) {
        int[] nums = {23, 43, 65, 76, 78, 89, 12, 32};
        int target = 76;
        int ans = linearsearch(nums, target);
        System.out.println(ans);
    }

    static int linearsearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (element == target) {
                return i;
            }
        }

        return -1; // target not found
    }

}
