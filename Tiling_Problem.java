public class Tiling_Problem {
    public static int tilingProblem(int n){
        if(n==0 || n==1){
            return 1;
        }
        //vertical choice
        int fnm1 = tilingProblem(n-1);

        //horizimal choice 
        int fnm2 = tilingProblem(n-1);

        int totalNoOfWays = fnm1 + fnm2;

        return totalNoOfWays;
    }
    public static void main(String args[]){
        System.out.println("Total number of ways of arranging tiles : "+tilingProblem(10));
    }
}
