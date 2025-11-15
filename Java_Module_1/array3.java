package Java_Module_1;
import java.util.*;
public class array3 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size= in.nextInt();
        int[] arr= new int[size];
        System.out.println("Enter" + size + "numbers");
        for(int i=0;i<size;i++){
            arr[i]= in.nextInt();
        }
        System.out.println("The array is : ");
        for(int i=0;i<size;i++){
            System.out.println(arr[i]);
        }
        in.close();
   }
}
