package Java_Module_1;
import java.util.*;
public class input {

    public static void main(String args[]){
        Scanner in= new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a= in.nextInt();
        System.out.println("Enter second number: ");
        int b= in.nextInt();
        int add= a+b;
        System.out.println("Addition of two numbers is: "+ add);
        int diff= a-b;
        System.out.println("Difference of two numbers is: "+diff);
        int mul= a*b;
        System.out.println("Multiplication of two numbers: "+mul);
        int div= a/b;
        System.out.println("Division of two numbers is: "+div);
        in.close();
    }
}
