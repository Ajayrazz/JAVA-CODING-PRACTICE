import java.util.*;
public class Practice_BitManuPulation_clearIthBit {
    public static int clearing(int num, int i){
        int bitmask = ~(1<<i);
        return (num & bitmask);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("New value , after clearing the ith position : "+clearing(num, 2));
    }
}
