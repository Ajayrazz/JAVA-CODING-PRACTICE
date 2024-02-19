import java.util.*;
public class Practice_BitManipulation_Count_SetBit {
    public static int counting(int num){
        int count = 0;
        while(num > 0){
            if((num & 1)!=0){
                count++;
            }
            num = num>>1;
        }
        return count;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Total number 1 in the user given input is "+counting(num));
    }
}
