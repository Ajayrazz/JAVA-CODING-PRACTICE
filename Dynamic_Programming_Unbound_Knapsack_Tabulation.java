public class Dynamic_Programming_Unbound_Knapsack_Tabulation {
    
    public static int unboundknapsack(int val[] , int wt[] , int W){
        int n = val.length;
        //create dp[][]
        int dp[][] = new int[n+1][W+1];
        //initialize dp[][]
        for(int i=0; i<dp.length; i++){
            dp[i][0] = 0;
        }
        for(int j=0; j<dp[0].length; j++){
            dp[0][j] = 0;
        }

        for(int i=1; i<n+1; i++){
            for(int j=1; j<W+1; j++){
                if(wt[i-1] <= j){ // valid
                    dp[i][j] = Math.max(val[i-1]+dp[i][j-wt[i-1]] , dp[i-1][j]);
                } else { // invalid
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[n][W];
    }
    public static void main(String args[]){
        int val[] = {15,14,10,45,30};
        int wt[] = {2,5,1,3,4};
        int W = 10;

        System.out.println("Max Profit : " + unboundknapsack(val, wt, W));
    }
}
