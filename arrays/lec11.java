package arrays;
import java.util.*;
public class lec11 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of rows");
        int rows = sc.nextInt();
        System.out.println("enter number of cols");
        int cols = sc.nextInt();

        //arrays
        int[][] numbers = new int[rows][cols];

        //taking inputs
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                numbers[i][j] = sc.nextInt();
            }
        }

        //taking outputs
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(numbers[i][j] +" ");
            }
            System.out.println();
        }
    }
}
