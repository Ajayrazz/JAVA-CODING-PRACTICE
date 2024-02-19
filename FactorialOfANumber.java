import java.util.*;
public class FactorialOfANumber {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        int factorial = 1;
        for (int i = num; i > 0; i--){
            factorial *= i;
        }
        System.out.println("Factorial of the given number : " + factorial);
    }
}
