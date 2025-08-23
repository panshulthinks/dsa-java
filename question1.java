import java.util.*;
public class question1 {
    public static int calculatingAverage(int a, int b, int c){
        int average = (a + b + c) / 3;
        return average;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("Enter third number: ");
        int c = sc.nextInt();
        System.out.println("The average of 3 numbers is -" + calculatingAverage(a, b, c));
    }
}
