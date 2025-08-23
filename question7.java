package arrays;
import java.util.*;
public class question7 {
    // arrays lecture questions
    //Take an array of names as input from the user and print them on the screen.

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the input for the arrays-");
        int size = sc.nextInt();
        String names[] = new String[size];

        //taking inputs
        for(int i=0; i<size; i++){
            System.out.println("the values in the arrays for"+ i +"position is");
            names[i] = sc.next();
        }

        //taking outputs
        for(int i=0; i<names.length; i++){
            System.out.println(names[i]);
        }
    }
}
