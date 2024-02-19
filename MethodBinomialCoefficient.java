import java.util.*;
public class MethodBinomialCoefficient {
    public static int factorial(int a){
        int factValue = 1;
        while(a>0){
            factValue = factValue * a;
            a--;
        }
        return factValue;
    }

    public static int binoCoeff(int x, int y){
        int fact_x = factorial(x);
        int fact_y = factorial(y);
        int fact_xmy = factorial(x-y);
        int binCoeff_Value = fact_x/(fact_y * fact_xmy) ;
        return binCoeff_Value;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value for n : ");
        int n = sc.nextInt();
        System.out.print("Enter value for r : ");
        int r = sc.nextInt();
        System.out.println("Binomial coefficient value of the given number : "+binoCoeff(n, r));

    }
}
