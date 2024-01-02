import java.util.*;
public class LargestOfTwoNumber {
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter value : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a >= b) {
            System.out.println("Largest number : " + a);
        }
        else{
            System.out.println("Largest number : " + b);
        }
    }
}
