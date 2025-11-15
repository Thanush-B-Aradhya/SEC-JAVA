package Java_Module_1;
import java.util.*;
class Greater{
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter a number");
        int a= in.nextInt();
        if(a>0){
            System.out.println(a + "is positive");
        } else{
            System.out.println(a + "is negative");
        }
        in.close();
    }
}