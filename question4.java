import java.util.*;
public class question4 {
    public static double calculatecircumfranceofcircle(double radius){
        return 2 * 3.14 * radius;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of circle: ");
        double radius = sc.nextDouble();
        System.out.println("The circumfrance of circle is - " + calculatecircumfranceofcircle(radius));
    }
}
