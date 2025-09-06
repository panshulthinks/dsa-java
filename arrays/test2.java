package arrays;
import java.util.Scanner;  
import java.util.Arrays;


public class test2 {
    public static void main(String[] args) {
        int nums[] = {2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(nums));  
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
    
    static void change(int arr[]) {
        arr[2] = 7;
    }
} 
