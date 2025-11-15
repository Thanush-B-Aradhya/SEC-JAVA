package Java_Module_1;

public class findMinimum {
    public static void main(String[] args) {
        int[] arr = {10, 55, 23, 78, 50};
        int min = arr[0];

        for (int num : arr) {
            if (num < min) min = num;
        }

        System.out.println("Minimum element: " + min);
    }
}
