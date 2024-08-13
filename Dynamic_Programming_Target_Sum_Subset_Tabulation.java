public class Dynamic_Programming_Target_Sum_Subset_Tabulation {
    
    public static boolean targetSum(int num[] , int sum){
        int n = num.length;
        //initialize dp[][]
        boolean dp[][] = new  boolean[n+1][sum+1];
        //initialize first column with true
        for(int i=0; i<n+1; i++){
            dp[i][0] = true;
        }

        for(int i=1; i<n+1; i++){
            for(int j=1; j<sum+1; j++){
                //include
                if(num[i-1] <= j && dp[i-1][j-num[i-1]] == true){
                    dp[i][j] = true;
                }
                else if(dp[i-1][j] == true){
                    dp[i][j] = true;
                }
            }
        }
        return dp[n][sum];
    }
    public static void main(String args[]){
        int num[] = {4,2,7,1,3};
        int sum = 20;
        System.out.println(targetSum(num, sum));
    }
}
