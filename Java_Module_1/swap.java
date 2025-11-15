package Java_Module_1;

public class swap{
    public static void main(String[] args) {
        int[] arr = {10, 55, 23, 78, 50};

        int temp = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;

        System.out.print("Array after swapping: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
 
    

