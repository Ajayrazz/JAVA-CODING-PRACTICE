//program to find the sum of n natural number using recursion

import java.util.*;
public class Recursion__SumOfNaturalNumber {
    
    public static int sum(int n){
        if(n == 1){
            return 1; 
        }
        int val = n + sum(n-1);

        return val;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println("Sum of the all the natural number -> " + sum(num));
    }
}
