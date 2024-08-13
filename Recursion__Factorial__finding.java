//program for finding the factorial of user given number by using recursion

import java.util.*;
public class Recursion__Factorial__finding {
    
    public static int fibonacci(int num){
        if(num == 0){
            return 1;
        }
        int fn = num * fibonacci(num-1);

        return fn;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println("Fibonacci of " + num + " -> " + fibonacci(num));
    }
}
