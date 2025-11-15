package Java_Module_1;
import java.util.Scanner;

public class findIndex {
    public static void main(String[] args) {
        int[] arr = {10, 55, 23, 78, 50};
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number to find index: ");
        int value = sc.nextInt();

        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                System.out.println("Index of " + value + " is " + i);
                found = true;
                break;  // remove if you want all indices
            }
        }

        if (!found) {
            System.out.println(value + " not found in the array.");
        }

        sc.close();
    }
}

