import java.util.*;
public class MethodAvgOfThreeNumber {
    public static void avgofThree(int a, int b, int c){
        float avg = (a+b+c)/3;
        System.out.println("The average value of given three number is : "+avg);
        return;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int x = sc.nextInt();
        System.out.print("Enter second number : ");
        int y = sc.nextInt();
        System.out.print("Enter third number : ");
        int z = sc.nextInt();
        avgofThree(x,y,z);

    }
}
