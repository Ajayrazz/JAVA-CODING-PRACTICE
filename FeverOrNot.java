import java.util.*;
public class FeverOrNot {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Body Temperature : ");
        float temp = sc.nextFloat();
        if (temp > 100){
            System.out.println("You have fever");
        }
        else{
            System.out.println("You dont have fever");
        }
    }
}
