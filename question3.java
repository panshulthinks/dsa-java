import java.util.*;
public class question3 {
    public static void calculategreatest(int a, int b){
        if(a > b){
            System.out.println(" a is greatest");
        } else if(b > a){
            System.out.println(" b is greatest");
        } else{
            System.out.println("Both are equal");
        }

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();
        calculategreatest(a,b);
    }
}
