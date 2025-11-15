package Java_Module_1;
public class count1 {
    public static void main(String[] args) {
    int arr[]= {10,20,60,70,65,89,67};
    int count= greaterThan50(arr);
    System.out.println("Numbers greater than 50: "+ count);
    }
    public static int greaterThan50(int[] arr){
        int count=0;
        for(int num:arr){
            if(num>50){
              count++;
            }
        }
    return count;
}
}
