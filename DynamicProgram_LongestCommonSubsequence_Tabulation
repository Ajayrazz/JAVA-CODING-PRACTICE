public class DynamicProgram_LongestCommonSubsequence_Tabulation {
    
    public static int lcsTab(String str1 , String str2){
        int n = str1.length();
        int m = str2.length();

        if(n == 0 || m == 0){
            return 0;
        }

        //create tab
        int dp[][] = new int[n+1][m+1];
        //initialize
        for(int i=0; i<n+1; i++){
            for(int j=0; j<m+1; j++){
                if(i == 0 || j == 0){
                    dp[i][j] = 0;
                }
            }
        }

        for(int i=1; i<n+1; i++){
            for(int j=1; j<m+1; j++){
                if(str1.charAt(i-1) == str2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1]+1;
                } else {
                    int ans1 = dp[i-1][j];
                    int ans2 = dp[i][j-1];
                    dp[i][j] = Math.max(ans1 , ans2);
                }
            }
        }
        return dp[n][m];
    }
    public static void main(String args[]){
        String str1 = "abcdefghijk";
        String str2 = "aceghk";

        System.out.println(lcsTab(str1, str2));
    }
}
