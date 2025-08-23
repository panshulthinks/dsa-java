import java.util.Scanner;

public class lec3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if(age >= 18){
            System.out.println("Adult");
        } else{
            System.out.println("NOT adult");
        }
    }
}

import java.util.Scanner;

public class lec3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input numbers
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        // Menu
        System.out.println("Choose operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Remainder");

        int n = sc.nextInt();

        // Perform operation
        switch(n) {
            case 1:
                System.out.println("Addition = " + (a + b));
                break;
            case 2:
                System.out.println("Subtraction = " + (a - b));
                break;
            case 3:
                System.out.println("Multiplication = " + (a * b));
                break;
            case 4:
                if (b != 0) {
                    System.out.println("Division = " + ((float)a / b));
                } else {
                    System.out.println("Cannot divide by 0");
                }
                break;
            case 5:
                System.out.println("Remainder = " + (a % b));
                break;
            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}
