import java.util.*;
public class Practice_BitManupulation_GetIthBit {
    public static int getithbit(int num, int i){
        int bitmask = (1<<i);
        if((num & bitmask) == 0){
            return 0;
        }
        else{
            return 1;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Ith bit will be "+getithbit(num, 3));
    }
}
