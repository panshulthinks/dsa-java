package binarysearch;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/kth-missing-positive-number/


public class question_1539 {
    public int findKthPositive(int[] arr, int k) {
        List<Integer> missing = new ArrayList<>();
        int current = 1;
        int i = 0;
        
        while (missing.size() < k) {
            if (i < arr.length && arr[i] == current) {
                i++;
            } else {
                missing.add(current);
            }
            current++;
        }
        
        return missing.get(k - 1);
    }
}




// this isnt the best thing we can do
// we know the array is sorted in increasing order so this means we could have used binarysearch also
// this is the efficent thing here

class Solution {
    public int findKthPositive(int[] arr, int k) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int missing = arr[mid] - (mid + 1);

            if (missing < k) {
                left = mid + 1;  // not enough missing numbers yet
            } else {
                right = mid - 1; // too many missing, go left
            }
        }

        // After the loop, 'left' is the first index where missing >= k
        // So, kth missing number is k + left
        return k + left;
    }
}
