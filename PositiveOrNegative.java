import java.util.*;
public class PositiveOrNegative {
    public static void main (String argd[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number = ");
        int num = sc.nextInt();
        if (num > 0){
            System.out.println("Given number is positive");
        }
        else{
            System.out.println("Given number is negative");
        }
    }
}
