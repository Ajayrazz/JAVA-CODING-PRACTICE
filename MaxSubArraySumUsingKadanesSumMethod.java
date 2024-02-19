import java.util.*;
public class MaxSubArraySumUsingKadanesSumMethod {
    public static void maxSubarraySum(int nums[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            currSum += nums[i];

            if(currSum < 0){
                currSum = 0;
            }

            maxSum = Math.max(currSum,maxSum);
        }
        System.out.println("Max sum : "+maxSum);
        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value for n : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        maxSubarraySum(arr);
    }
}
