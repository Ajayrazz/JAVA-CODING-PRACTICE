import java.util.*;
public class MethodBinaryToDecimalConversion {
    public static void binToDecimal(int a){
        int decValue = 0;
        int pow = 0;
        while(a>0){
            int lastDigit = a%10;
            decValue = decValue + (int)(lastDigit * Math.pow(2,pow));
            a = a/10;
            pow++;
        }
        System.out.println("Value after converting the binary to decimal : "+decValue);
        return;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value : ");
        int n = sc.nextInt();
        binToDecimal(n);

    }
}
