import java.util.*;
public class Practice_BitManuPulation_checkingPowerOf2 {
    public static void checking(int num){
        if((num & num-1) == 0){
            System.out.println(num+" is power of 2.");
        }
        else{
            System.out.println(num+" is not power of 2.");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        checking(num);
    }
}
