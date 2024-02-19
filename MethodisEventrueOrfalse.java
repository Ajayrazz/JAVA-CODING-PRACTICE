import java.util.*;
<<<<<<< HEAD
public class MethodisEventrueOrfalse{
    public static boolean isEven (int n){
        boolean result = true;
        if(n%2==0){
            result = true;
        } else {
            result = false;
        }
        return result;
=======
public class MethodisEventrueOrfalse {
    public static boolean isEvenNo(int a){
        boolean isEven = true;
        if(a%2==0){
            isEven = true;
        } else {
            isEven = false;
        }
        return isEven;
>>>>>>> 29e397ec91a2ac6ea53aa674f790322940b662b3
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value : ");
<<<<<<< HEAD
        int a = sc.nextInt();
        System.out.println(isEven(a));
    }
}
=======
        int n = sc.nextInt();
        System.out.print(isEvenNo(n));
    }
}
>>>>>>> 29e397ec91a2ac6ea53aa674f790322940b662b3
