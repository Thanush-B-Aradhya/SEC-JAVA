package Java_Module_1;
import java.util.*;
public class numberSquare {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n= in.nextInt();
        int sq_n= n*n;
        System.out.println("Square of" + n + "is" + sq_n);
        in.close();
       }
}
