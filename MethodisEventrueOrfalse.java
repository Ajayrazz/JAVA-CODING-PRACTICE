import java.util.*;
public class MethodisEventrueOrfalse{
    public static boolean isEven (int n){
        boolean result = true;
        if(n%2==0){
            result = true;
        } else {
            result = false;
        }
        return result;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value : ");
        int a = sc.nextInt();
        System.out.println(isEven(a));
    }
}