//program to print a pattern of 0-1 triangke pattern
import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value : ");
        int n = sc.nextInt();
        int a = 1;
        int b = 0;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if((i+j)%2!=0){
                    System.out.print(b);
                } else {
                    System.out.print(a);
                }
            }
            System.out.println();
        }
    }
}
