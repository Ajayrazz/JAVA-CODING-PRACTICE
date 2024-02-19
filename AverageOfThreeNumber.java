import java.util.*;
public class AverageOfThreeNumber {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int average = (int)((a+b+c)/2);
        System.out.println("Average of three number : " + average);
    }
}
