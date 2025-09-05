package arrays;
import java.util.*;
public class question8 {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the input for the arrays-");
        int size = sc.nextInt();
        int numbers[] = new int[size];
        
        //inputing
        for(int i=0; i<size; i++) {
        5System.out.println("the values in the arrays for"+ i +"position is");
          numbers[i] = sc.nextInt();
      }

        //initialize min and max
        int max = numbers[0];
        int min = numbers[0];
        
        //looping through
        for(int i=0; i<numbers.length; i++){
            if (numbers[i] > max){
                max = numbers[i];//updating the array to the max values its find the array which we defined
            }
            if (numbers[i] < min){
                min = numbers[i];//updating the min value
            }
        }
        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
    }
}
