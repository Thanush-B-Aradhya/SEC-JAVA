//find the sum and avg of elements in the array
package Java_Module_1;
import java.util.*;
public class array4 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int sum=0;
        double average;
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
        //sum of elements of array
        for(int i=0;i<size;i++){
            sum+= arr[i];
        }
        //avg of array elements
        average = (double) sum / size;
        System.out.println("Sum of array elements is : " +sum);
        System.out.println("Average of array elements is : " +average);
        in.close();
    }
}
