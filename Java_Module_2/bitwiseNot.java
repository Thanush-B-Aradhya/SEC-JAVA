package Java_Module_2;

public class bitwiseNot {
    public static void main(String[] args) {
        int a=5;
        int result=(~a+1)*2;
        //~a= bitwise NOT of 5= -6
        //~a+1= -5
        //result= -5*2= -10
        System.out.println("Result: " + result);
    }
}
