import java.util.*;
public class MethodAverageThreeNumber {
    public static void avgNum(int a, int b, int c){
        float value = (a+b+c)/3;
        System.out.println("Average of the given three number is "+ value);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first value : ");
        int x = sc.nextInt();
        System.out.print("Enter sencond value : ");
        int y = sc.nextInt();
        System.out.print("Enter third value : ");
        int z = sc.nextInt();
        avgNum(x,y,z);


    }
}
