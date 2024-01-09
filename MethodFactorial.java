import java.util.*;
public class MethodFactorial {
    public static int factorial(int a){
        int factValue = 1;
        while(a>0){
            factValue = factValue * a;
            a--;
        }
        return factValue;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value : ");
        int n = sc.nextInt();
        int fact = factorial(n);
        System.out.println("Factoral value of the given number : "+fact);

    }
}
