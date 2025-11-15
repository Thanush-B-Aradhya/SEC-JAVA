package Java_Module_2;

public class LogicalAnd {
    public static void main(String[] args) {
        int age=25;
        boolean hasLicense=true;

        if(age>18 && hasLicense){
            System.out.println("Eligible to drive.");
        }else{
            System.out.println("Not eligible to drive.");
        }
    }
}
