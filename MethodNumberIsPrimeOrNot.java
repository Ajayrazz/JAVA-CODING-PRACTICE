import java.util.*;
<<<<<<< HEAD
public class MethodNumberIsPrimeOrNot{
    public static void isPrime(int a){
        if(a==1){
            System.out.println("Given number is neither prime nor consecutive.");
        } else if (a==2){
            System.out.println("Prime Number.");
        } else {
            for(int i=2; i<=a-1; i++){
                if(a%i==0){
                    System.out.println("Not a prime number.");
                    break;
                } else {
                    System.out.println("Prime Number.");
                    break;
        
                }
            }
        }
        return;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a value : ");
        int n = sc.nextInt();
        isPrime(n);
    }
}
=======
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
>>>>>>> 29e397ec91a2ac6ea53aa674f790322940b662b3
