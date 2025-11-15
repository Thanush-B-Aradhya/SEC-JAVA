package Java_Module_1;

import java.util.Scanner;

public class searchNumber {
    public static void main(String[] args) {
        int[] arr = {10, 55, 23, 78, 50};
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number to search: ");
        int search = sc.nextInt();

        boolean found = false;
        for (int num : arr) {
            if (num == search) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println(search + " exists in the array.");
        } else {
            System.out.println(search + " does not exist in the array.");
        }

        sc.close();
    }
}
