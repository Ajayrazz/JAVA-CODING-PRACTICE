import java.util.*;
public class CalculatorByUsingSwitch {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter operator value : ");
        char operator = sc.next().charAt(0);
        int a = sc.nextInt();
        int b = sc.nextInt();
        switch (operator) {
            case '+': System.out.println("Value : " + (a+b));
                            break;
            case '-': System.out.println("Value : " + (a-b));
                            break;
            case '*': System.out.println("Value : " + (a*b));
                            break;
            case '/': System.out.println("Value : " + (a/b));
                            break;
            case '%': System.out.println("Value : " + (a%b));
                            break;
            default : System.out.println("Enter right operator");
        }
    }
}
