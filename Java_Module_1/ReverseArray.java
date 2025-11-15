package Java_Module_1;
public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {10, 55, 23, 78, 50};

        System.out.print("Array in reverse: ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
