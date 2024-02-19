import java.util.*;
public class Practice_Recursion_Decresing_Order {
    public static void decreasing(int num){
        if(num == 0){
            return;
        }
        System.out.print(num+" ");
        decreasing(num-1);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        decreasing(num);
    }
}
