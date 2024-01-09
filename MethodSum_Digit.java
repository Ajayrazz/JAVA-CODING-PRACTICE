import java.util.*;
public class MethodSum_Digit{
    public static void sumDigit (int n){
        int sumValue = 0;
        while(n>0){
            int lastDigit = n%10;
            sumValue += lastDigit;
            n = n/10;
        }
        System.out.println("Sum of digits of the given integers : "+sumValue);
        return;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first value : ");
        int a = sc.nextInt();
        sumDigit(a);

    }
}
