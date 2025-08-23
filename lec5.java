import java.util.*;

public class lec5 {
    public static void printMyName(String name) {
        System.out.println(name);
    }

    public static int calculateSum(int a, int b){
        int sum = a + b;
        return sum;
    }
    public static int calculateProduct(int c, int d){
        int product = a * b;
        return product;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Your name is - ");
        printMyName(name);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("The sum of numbers is - " + calculateSum(a,b));
        
        System.out.print("Enter first number for product: ");
        int c = sc.nextInt();
        System.out.print("Enter second number for product: ");
        int d = sc.nextInt();
        System.out.println("The product of numbers is - " + calculateProduct(c,d));
    }
}
