import java.util.*;
public class MaxSubArraySumUsingBruteForceMethod {
    public static void maxSubArraySum(int nums[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0; i<nums.length; i++){
            int start = i;
            for(int j=i+1; j<nums.length; j++){
                int end = j;
                currSum = 0;
                for(int k=start; k<=end; k++){
                    currSum += nums[k];
                }
                System.out.println(currSum);
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("max sum : "+maxSum);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value for n : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        maxSubArraySum(arr);
    }
}
