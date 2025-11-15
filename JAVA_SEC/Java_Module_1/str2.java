package Java_Module_1;
import java.util.*;
public class str2 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        String a= in.nextLine();
        String b= in.nextLine();
        a=a.toUpperCase();
        b=b.toUpperCase();
        if(a.equals(b)){
            System.out.println("Both the strings are equal.");
        }else{
            System.out.println("Both the strings are not equal.");
        }
        in.close();
    }
}
