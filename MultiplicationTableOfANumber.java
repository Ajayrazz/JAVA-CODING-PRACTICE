import java.util.*;
public class MultiplicationTableOfANumber {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();
        System.out.println("Multiplication Of The Given Number : ");
        for(int i=1; i<=10; i++){
            int mul = num*i;
            System.out.println(num+" * "+i+" = "+mul);
        }
    }
}
