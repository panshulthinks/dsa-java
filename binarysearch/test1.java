package binarysearch;

public class test1 {
    public static void main(String[] args) {

        int[] arr = {-18, -3, 1, 3, 5, 7};
        int target = 89;
        int ans = binarysearch(arr, target);
        System.err.println(ans);
        
    }

    static int binarysearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start) /2;

            if(target < arr[mid]){
                end = mid - 1;
            } else if(target > arr[mid]){
                start = mid + 1;
            } else{
                return mid;
            }
        }

        return -1;
    }
    
}

