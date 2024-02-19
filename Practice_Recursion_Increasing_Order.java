import java.util.*;
public class Practice_Recursion_Increasing_Order {
    public static void incresing(int num){
        if(num==0){
            return;
        }
        incresing(num-1);
        System.out.print(num+" ");
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        incresing(num);
    }
}
