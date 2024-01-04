import java.util.*;
public class SumOfSetOfEvenOrOdd {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = sc.nextInt();
        int evenSum = 0;
        int oddSum = 0;
        do {
            int lastDigit = num%10;
            if (lastDigit%2==0){
                evenSum += lastDigit;
            }
            else{
                oddSum += lastDigit;
            }
            num = num/10;
        } while (num>0);

        System.out.println("Sum of all the even number : " + evenSum);
        System.out.println("Sum of all the odd number : " + oddSum);
        
    }
}
