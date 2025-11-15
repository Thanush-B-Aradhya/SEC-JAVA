package Java_Module_2;

public class mixedOperators {
    public static void main(String[] args) {
        int a=4,b=2,c=7;
        int result= ++a *(b-- + ~c)- (-b);
        System.out.println("Result: " + result);
    }
}
