//program for finding the n-th fibonacci number using recursion

import java.util.*;
public class Recursion__Finding__Nth__Fibonacci__Number {
    
    public static int nthfibo(int n){
        if(n==0 || n==1){
            return n;
        }
        int fn1 = nthfibo(n-1);
        int fn2 = nthfibo(n-2);
        int fn = fn1 + fn2;

        return fn;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println("Nth fibo -> " + nthfibo(num));
    }
}
