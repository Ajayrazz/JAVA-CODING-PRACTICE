//program for printing number in increasing order by using stack

import java.util.*;
public class Practice___Stack__ {
    
    public static void increasingPrinting(int num){
        if(num == 1){
            System.out.print(num + " ");
            return;
        }
        increasingPrinting(num-1);
        System.out.print(num + " ");
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        increasingPrinting(num);
    }
}
