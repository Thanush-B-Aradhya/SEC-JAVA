import java.util.Scanner;

public class BitwiseOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter first integer: ");
        int a = sc.nextInt();

        System.out.print("Enter second integer: ");
        int b = sc.nextInt();

        // Bitwise operations
        int and = a & b;
        int or = a | b;
        int xor = a ^ b;

        // Display results in binary
        System.out.println("Binary of a       : " + Integer.toBinaryString(a));
        System.out.println("Binary of b       : " + Integer.toBinaryString(b));

        System.out.println("a AND b (binary)  : " + Integer.toBinaryString(and));
        System.out.println("a OR  b (binary)  : " + Integer.toBinaryString(or));
        System.out.println("a XOR b (binary)  : " + Integer.toBinaryString(xor));

        sc.close();
    }
}
