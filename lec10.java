package arrays;
import java.util.*;
public class lec10 {
    public static void main(String args[]){
        // initialization
        // int[] marks = new int[100];
        // marks[0] = 97;
        // marks[1] = 85;
        // marks[2] = 33;

        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);

        // for(int i=0; i<3; i++){
        //     System.out.println(marks[i]);
        // }

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the input for the arrays-");
        int size = sc.nextInt();
        int numbers[] = new int[size];// defining arrays

        // input
        for(int i=0; i<size; i++){
            numbers[i] = sc.nextInt();
        }
        System.out.println("print the value to find");
        int x = sc.nextInt();

        //output
        for(int i=0; i<numbers.length; i++){
            System.out.println(numbers[i]);
            if(numbers[i] == x){
                System.out.println("found at index:" +i);
            }
        }
    }
}
