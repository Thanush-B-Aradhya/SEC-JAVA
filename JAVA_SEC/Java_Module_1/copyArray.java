package Java_Module_1;

public class copyArray {
    public static void main(String[] args) {
        int[] arr = {10, 55, 23, 78, 50};
        int[] copy = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            copy[i] = arr[i];
        }

        System.out.print("Copied array: ");
        for (int num : copy) {
            System.out.print(num + " ");
        }
    }
}


