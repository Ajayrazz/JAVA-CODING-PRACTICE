import java.util.*;
public class Number_Of_bits {
    public static void main(String args[]){
        int num = 011101011;

        int count = 0;
        for(int i=0; i<32; i++){
            if((num & 1) == 1){
                count++;
            }
            num>>=1;
        }

        System.out.println("Total number of 1 Bits -> " + count);

    }
}
