package Java_Module_1;
import java.util.Scanner;

public class count2{
    public static void main(String[] args) {
        int[] arr = {10, 55, 23, 78, 50, 55, 23};
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number to count: ");
        int target = sc.nextInt();

        int count = 0;
        for (int num : arr) {
            if (num == target) count++;
        }

        System.out.println(target + " appears " + count + " times.");

        sc.close();
    }
}
