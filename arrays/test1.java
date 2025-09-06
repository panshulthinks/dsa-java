package arrays;
import java.util.Scanner;   

public class test1 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        int[] ros; // declaration of array
        ros = new int[3]; // memory allocation of the array
        System.out.println(ros[0]); // accessing the array (default value is 0)

        // input from user
        for (int i = 0; i < ros.length; i++) {
            ros[i] = in.nextInt();
        }

        // using loops to access the values of array
        for (int i = 0; i < ros.length; i++) {
            System.out.println(ros[i]);
        }

        // enhanced for loop
        for (int num : ros) { // for every element in array print it
            System.out.println(num); // here num is the element of array
        }

        in.close(); // good practice to close Scanner
    }
}
