import java.util.*;
public class LargestOfThree {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value : ");
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        if( A>B && A>C){
            System.out.println("Large value : " + A);
        }
        else if( B>C ){
            System.out.println("Large value : " + B);
        }
        else{
            System.out.println("Large value : " + C);
        }
    }
}
