import java.util.*;
public class MethodDeciumalToBinary {
    public static void deciToBinary(int a){
        int binValue = 0;
        int pow = 0;
        while(a>0){
            int lastDigit = a%2;
            binValue = binValue + (int)(lastDigit * Math.pow(10,pow));
            pow++;
            a = a/2;
        }
        System.out.println("Value after converting decimal to binary : "+binValue);
        return;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value : ");
        int n = sc.nextInt();
        deciToBinary(n);
    }
}
