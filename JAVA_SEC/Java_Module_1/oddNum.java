package Java_Module_1;
public class oddNum {
    public static void main(String[] args) {
        int[] arr = {10, 55, 23, 78, 50};

        System.out.print("Odd numbers: ");
        for (int num : arr) {
            if (num % 2 != 0) System.out.print(num + " ");
        }
    }
}
