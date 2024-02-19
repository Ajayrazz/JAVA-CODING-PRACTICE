import java.util.*;
public class Practice_BitManupulation_SetIthBit {
    public static int setIthBit(int num, int i){
        int bitmask = 1<<i;
        return (num | bitmask);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("After setting bit at the ith position the value will be "+setIthBit(num, 3));
    }
}
