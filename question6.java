import java.util.*;

public class question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms (n): ");
        int n = sc.nextInt();

        // Variables to store the first two terms
        int a = 0, b = 1;

        System.out.print("Fibonacci Series: ");

        for(int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            
            int next = a + b;  // Next term is sum of previous two
            
            // Update variables for next iteration
            a = b;  
            b = next;
        }
    }
}
