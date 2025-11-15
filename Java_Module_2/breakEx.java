package Java_Module_2;

public class breakEx {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++){
            if(i==5){
                System.out.println("breaking the loop at i = "+ i);
                break;
            }
            System.out.println("i = " + i);

        }
    }
}
