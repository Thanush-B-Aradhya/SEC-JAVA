import java.util.Scanner;

public class Operations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input two integers
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        // Perform operations
        int sum = a + b;
        int diff = a - b;
        int prod = a * b;
        
        // For division, check if b is zero
        if (b != 0) {
            int quotient = a / b;
            int remainder = a % b;

            // Display results
            System.out.println("Sum = " + sum);
            System.out.println("Difference = " + diff);
            System.out.println("Product = " + prod);
            System.out.println("Quotient = " + quotient);
            System.out.println("Remainder = " + remainder);
        } else {
            System.out.println("Sum = " + sum);
            System.out.println("Difference = " + diff);
            System.out.println("Product = " + prod);
            System.out.println("Cannot divide by zero!");
        }

        sc.close();
    }
}
