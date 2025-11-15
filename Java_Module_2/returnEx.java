package Java_Module_2;

public class returnEx {
    public static void main(String[] args) {
        System.out.println("Start of program");
        checkNumber(5);
        System.out.println("End of program.");
    }
    public static void checkNumber(int num){
        if(num<0){
            System.out.println("Negative Number");
            return;
        }
        System.out.println("Positive number or zero");
    }
}
