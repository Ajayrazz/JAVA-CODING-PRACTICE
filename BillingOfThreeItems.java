import java.util.*;
public class BillingOfThreeItems {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter float value of three item : ");
        Float pencil = sc.nextFloat();
        Float pen = sc.nextFloat();
        Float eraser = sc.nextFloat();
        Float bill = (float)((pencil + (pencil * 0.18)) + (pen + (pen * 0.18)) + (eraser + (eraser * 0.18)));
        System.out.println("The value of product : " + bill);
    }
}
