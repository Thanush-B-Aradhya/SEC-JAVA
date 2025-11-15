package Java_Module_1;
import java.util.*;
public class greater {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a= in.nextInt();
        int b= in.nextInt();
        if(a>b){
            System.out.println(a + "is greater than" + b);
        }else{
            System.out.println(b + "is greater than" + a);
        }
        in.close();
    }
}
