import java.util.*;

public class ODD_EVEN {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a number : ");
        int a = sc.nextInt();
        if (a%2==0) {
            System.out.println("EVEN NUMBER");
        }
        else {
            System.out.println("ODD NUMBER");
        }
    }
}
