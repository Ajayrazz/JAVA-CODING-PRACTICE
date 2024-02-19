import java.util.*;
public class Converting_binarytoDecimal {
    public static int conv(int n){
        if(n==0 || n==1){
            return n;
        }
        int deci_Value = 0;
        while(n>0){
            int lastDigit = n%10;
            deci_Value *= 10 + lastDigit;
            n = n/10; 
        }
        return deci_Value;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter binary value : ");
        int n = sc.nextInt();
        System.out.println("Decimal value : "+conv(n));

    }
}
