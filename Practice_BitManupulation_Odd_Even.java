import java.util.*;
public class Practice_BitManupulation_Odd_Even {
    public static void checking(int num){
        int bitmask = 1;
        if( (num & bitmask) == 0){
            System.out.println(num+" is an even number.");
        }
        else{
            System.out.println(num+" is an odd number.");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        checking(n);
    }
}
