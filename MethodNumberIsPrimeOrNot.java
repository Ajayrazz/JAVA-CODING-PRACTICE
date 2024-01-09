import java.util.*;
public class MethodNumberIsPrimeOrNot {
    public static boolean isPrime (int a){
        boolean result = true;
        if(a==2) return true;
        for(int i = 2; i<= a-1; i++){
            if(a%i==0){
                result = false;
                break;
            } else {
                result = true;
            }
        }
        return result;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value : ");
        int n = sc.nextInt();
        System.out.println(isPrime(n));

    }
}
