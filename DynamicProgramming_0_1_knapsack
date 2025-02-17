import java.util.*;
public class DynamicProgramming_0_1_knapsack {
    
    public static int maxProfit( int val[] , int wt[] , int W , int n){
        if(n == 0 || W == 0){
            return 0;
        }

        if(wt[n-1] <= W){   // valid
            //include
            int ans1 = val[n-1] + maxProfit(val, wt, W - wt[n-1], n-1);

            //exclude
            int ans2 = maxProfit(val, wt, W, n-1);

            return Math.max(ans1 , ans2);
        } else {
            return maxProfit(val, wt, W, n-1);
        }
    }
    public static void main(String args[]){
        int val[] = {15 , 14 , 10 , 45 , 30};
        int wt[] = {2 , 5 , 1 , 3 , 4};
        int W = 10;
        int n = val.length;
        System.out.println("Max profit : "+ maxProfit(val, wt, W, n));
    }
}
