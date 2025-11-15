package Java_Module_1;

public class findMaximum {
    public static void main(String[] args) {
        int[] arr = {10, 55, 23, 78, 50};
        int max = arr[0];

        for (int num : arr) {
            if (num > max) max = num;
        }

        System.out.println("Maximum element: " + max);
    }
}

