import java.util.*;
public class IncomeTaxCalculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your salary : ");
        int sal = sc.nextInt();
        if ( sal <= 300000){
            int tax = (int)(sal * 0.1);
            int save = (int)(sal - tax);
            System.out.println("Total Saving : " + save);
        }
        else if (sal > 300000 && sal < 800000){
            int tax = (int)(sal * 0.2);
            int save = (int)(sal - tax);
            System.out.println("Total saving : " + save);
        }else{
            int tax = (int)(sal * 0.3);
            int save = (int)(sal - tax);
            System.out.println("Total saving : " + save);
        }
    }
}
