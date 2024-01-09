import java.util.*;
public class MethodisPrimeOrNot_OPTIMISED {
    public static boolean isPrime(int a){
        if(a==2) return true;
        for(int i=2; i<=Math.sqrt(a);i++){
            if(a%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value : ");
        int n = sc.nextInt();
        System.out.println("Given number is prime : "+isPrime(n));

    }
}
