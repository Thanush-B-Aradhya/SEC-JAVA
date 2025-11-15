package Java_Module_2;

public class logicalOr {
    public static void main(String[] args) {
        boolean isStudent= true;
        boolean isTeacher= false;
        if(isStudent||isTeacher){
            System.out.println("You can enter the campus.");
        }else{
            System.err.println("Access denied");
        }
    }
}
