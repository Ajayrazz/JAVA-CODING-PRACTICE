import java.util.*;
public class Practice___Stack___ {
    
    public static void reversePrinting(int n){
        if(n==1){
            System.out.print(n + " ");
            return;
        }
        System.out.print(n + " ");
        reversePrinting(n-1);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        reversePrinting(n);
    }
}
