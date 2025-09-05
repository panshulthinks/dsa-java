package arrays;
import java.util.*;

public class question9 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of rows");
        int rows = sc.nextInt();
        System.out.println("enter number of cols");
        int cols = sc.nextInt();

        int numbers[][] = new int[rows][cols];

        //taking inputs
         for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                numbers[i][j] = sc.nextInt();
            }
        }

        System.out.println("enter x to be find");
        int x = sc.nextInt();

        //output
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(numbers[i][j] == x){
                    System.out.println("x found at locations"+i+"," +j+" " );
                }
                 System.out.println();

            }
    }
}
}
