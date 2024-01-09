import java.util.*;
public class MethodisEventrueOrfalse {
    public static boolean isEvenNo(int a){
        boolean isEven = true;
        if(a%2==0){
            isEven = true;
        } else {
            isEven = false;
        }
        return isEven;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value : ");
        int n = sc.nextInt();
        System.out.print(isEvenNo(n));
    }
}
